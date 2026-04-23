import requests
import os

# ----------------------------
# ENV
# ----------------------------
SESSION = os.getenv("LEETCODE_SESSION")
CSRF = os.getenv("LEETCODE_CSRF")
GROQ_API_KEY = os.getenv("GROQ_API_KEY")

URL = "https://leetcode.com/graphql"

headers = {
    "Content-Type": "application/json",
    "Referer": "https://leetcode.com",
}

if SESSION and CSRF:
    headers["Cookie"] = f"LEETCODE_SESSION={SESSION}; csrftoken={CSRF}"
    headers["x-csrftoken"] = CSRF

USERNAME = "Dewanshu-Chirkhe"

# ----------------------------
# Utilities
# ----------------------------
def load_seen():
    if not os.path.exists("seen.txt"):
        return set()
    return set(open("seen.txt").read().splitlines())


def save_seen(seen):
    with open("seen.txt", "w") as f:
        f.write("\n".join(seen))


def format_qid(qid):
    return str(qid).zfill(4)


def to_camel_case(slug):
    return "".join(word.capitalize() for word in slug.split("-"))


# ----------------------------
# Fetch submissions
# ----------------------------
def get_recent_submissions():
    query = {
        "query": """
        query getRecent($username: String!) {
          recentAcSubmissionList(username: $username) {
            id
            title
            titleSlug
            timestamp
          }
        }
        """,
        "variables": {"username": USERNAME}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if res.status_code != 200 or "errors" in data:
        print("❌ Failed to fetch submissions")
        return []

    return data["data"]["recentAcSubmissionList"]


# ----------------------------
# Fetch submission details
# ----------------------------
def get_submission_details(sub_id):
    query = {
        "query": """
        query submissionDetails($id: Int!) {
          submissionDetails(submissionId: $id) {
            code
            runtime
            memory
            lang {
              name
            }
          }
        }
        """,
        "variables": {"id": int(sub_id)}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if "errors" in data or data["data"]["submissionDetails"] is None:
        print(f"❌ Failed details for {sub_id}")
        return None

    return data["data"]["submissionDetails"]


# ----------------------------
# Fetch question metadata
# ----------------------------
def get_question_meta(slug):
    query = {
        "query": """
        query getQuestion($titleSlug: String!) {
          question(titleSlug: $titleSlug) {
            questionId
            difficulty
          }
        }
        """,
        "variables": {"titleSlug": slug}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if "errors" in data:
        print(f"❌ Failed meta for {slug}")
        return None

    return data["data"]["question"]


# ----------------------------
# AI README (Groq)
# ----------------------------
def generate_ai_readme(title, code):
    if not GROQ_API_KEY:
        return """## 🧠 Approach
<!-- Add approach -->

## ⏱️ Complexity
- Time: O(?)
- Space: O(?)"""

    prompt = f"""
You are solving a LeetCode problem.

Problem: {title}

Given this solution:
{code}

Return ONLY markdown:

## 🧠 Approach
- Explain in 4-5 concise lines

## ⏱️ Complexity
- Time: O(...)
- Space: O(...)
"""

    try:
        res = requests.post(
            "https://api.groq.com/openai/v1/chat/completions",
            headers={
                "Authorization": f"Bearer {GROQ_API_KEY}",
                "Content-Type": "application/json",
            },
            json={
                "model": "llama-3.1-8b-instant",
                "messages": [{"role": "user", "content": prompt}],
                "temperature": 0.3,
            },
        )

        data = res.json()
        return data["choices"][0]["message"]["content"]

    except Exception as e:
        print("⚠️ Groq failed:", e)
        return """## 🧠 Approach
<!-- Add approach -->

## ⏱️ Complexity
- Time: O(?)
- Space: O(?)"""


# ----------------------------
# README
# ----------------------------
def generate_readme(title, slug, runtime, memory, code):
    ai_content = generate_ai_readme(title, code)

    return f"""# {title}

🔗 https://leetcode.com/problems/{slug}/

{ai_content}

## 📊 Stats
- Runtime: {runtime}
- Memory: {memory}
"""


# ----------------------------
# Save files
# ----------------------------
def save_problem(folder, title, slug, details):
    os.makedirs(folder, exist_ok=True)

    lang_map = {
        "python": "py",
        "python3": "py",
        "java": "java",
        "cpp": "cpp",
        "c": "c",
        "javascript": "js"
    }

    lang = details["lang"]["name"].lower()
    ext = lang_map.get(lang, "txt")

    runtime = details.get("runtime", "N/A")
    runtime = f"{runtime} ms" if runtime != "N/A" else runtime

    memory = details.get("memory", "N/A")
    if memory != "N/A":
        memory = round(memory / (1024 * 1024), 2)
        memory = f"{memory} MB"

    code = details["code"].replace("\\n", "\n")

    filename = to_camel_case(slug)

    with open(f"{folder}/{filename}.{ext}", "w", encoding="utf-8") as f:
        f.write(code)

    with open(f"{folder}/README.md", "w", encoding="utf-8") as f:
        f.write(generate_readme(title, slug, runtime, memory, code))


# ----------------------------
# Main
# ----------------------------
def main():
    seen = load_seen()
    updated = False
    solved_ids = []

    submissions = get_recent_submissions()

    for sub in submissions:
        sub_id = sub["id"]

        if sub_id in seen:
            continue

        print(f"Processing: {sub['title']}")

        details = get_submission_details(sub_id)
        if not details:
            continue

        meta = get_question_meta(sub["titleSlug"])
        if not meta:
            continue

        q_id = format_qid(meta["questionId"])
        difficulty = meta["difficulty"]

        folder = f"{q_id}-[{difficulty}]-{sub['titleSlug']}"

        save_problem(folder, sub["title"], sub["titleSlug"], details)

        solved_ids.append(q_id)
        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)

        with open("commit_msg.txt", "w") as f:
            f.write("solved : " + ", ".join(sorted(solved_ids)))

        print("✅ New submissions added")
    else:
        print("No new submissions")


if __name__ == "__main__":
    main()