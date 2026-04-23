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

# Add cookies only if available
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


def clean_filename(name):
    return name.replace(" ", "_").replace("-", "_")


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
        print(data)
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
def get_question_meta(title_slug):
    query = {
        "query": """
        query getQuestion($titleSlug: String!) {
          question(titleSlug: $titleSlug) {
            questionId
            difficulty
          }
        }
        """,
        "variables": {"titleSlug": title_slug}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if "errors" in data:
        print(f"❌ Failed meta for {title_slug}")
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
    Given the LeetCode problem "{title}" and the following solution:

    {code}

    Write:
    1. Approach (concise)
    2. Time Complexity
    3. Space Complexity
    """

    try:
        res = requests.post(
            "https://api.groq.com/openai/v1/chat/completions",
            headers={
                "Authorization": f"Bearer {GROQ_API_KEY}",
                "Content-Type": "application/json",
            },
            json={
                "model": "llama3-70b-8192",
                "messages": [{"role": "user", "content": prompt}],
                "temperature": 0.3,
            },
        )

        data = res.json()
        return data["choices"][0]["message"]["content"]

    except:
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
    memory = details.get("memory", "N/A")

    code = details["code"]

    # Fix formatting
    code = code.replace("\\n", "\n")

    filename = clean_filename(title)

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
    commit_messages = []

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

        q_id = meta["questionId"]
        difficulty = meta["difficulty"]

        folder = f"{q_id}-{difficulty}-{sub['titleSlug']}"

        save_problem(folder, sub["title"], sub["titleSlug"], details)

        lang = details["lang"]["name"]
        msg = f"{q_id}. {sub['title']} ({difficulty}, {lang})"
        commit_messages.append(msg)

        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)

        with open("commit_msg.txt", "w") as f:
            f.write("Add:\n- " + "\n- ".join(commit_messages))

        print("✅ New submissions added")
    else:
        print("No new submissions")


if __name__ == "__main__":
    main()