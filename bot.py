import requests
import os
import re

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
# Submission details
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
# Question meta
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
        return None

    return data["data"]["question"]

# ----------------------------
# Question content + examples
# ----------------------------
def get_question_details(slug):
    query = {
        "query": """
        query getQuestionDetail($titleSlug: String!) {
          question(titleSlug: $titleSlug) {
            content
            exampleTestcases
          }
        }
        """,
        "variables": {"titleSlug": slug}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if "errors" in data or not data["data"]["question"]:
        return None, None

    q = data["data"]["question"]
    return q["content"], q["exampleTestcases"]

# ----------------------------
# HTML → Markdown (simple clean)
# ----------------------------
def clean_html(html):
    if not html:
        return "Not available"

    # remove tags
    text = re.sub('<.*?>', '', html)

    # fix spacing
    text = text.replace("&nbsp;", " ")
    text = text.replace("&lt;", "<").replace("&gt;", ">")

    return text.strip()

# ----------------------------
# Format examples
# ----------------------------
def format_examples(raw):
    if not raw:
        return "Not available"

    lines = raw.strip().split("\n")
    result = []

    for i in range(0, len(lines), 2):
        if i + 1 < len(lines):
            result.append(f"Example {i//2 + 1}:\n- Input: {lines[i]}\n- Output: {lines[i+1]}")

    return "\n\n".join(result)

# ----------------------------
# AI README (fixed)
# ----------------------------
def generate_ai_readme(title, code):
    if not GROQ_API_KEY:
        return """## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)"""

    prompt = f"""
Problem: {title}

Given solution:
{code}

STRICT RULES:
- EXACTLY 4 bullet points
- No paragraphs

Format:

## 🧠 Approach
- Point 1
- Point 2
- Point 3
- Point 4

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
                "temperature": 0
            },
        )

        data = res.json()
        return data["choices"][0]["message"]["content"]

    except:
        return """## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)"""

# ----------------------------
# README generator
# ----------------------------
def generate_readme(title, slug, runtime, memory, code, content, examples):
    clean_content = clean_html(content)
    formatted_examples = format_examples(examples)
    ai = generate_ai_readme(title, code)

    return f"""# {title}

🔗 https://leetcode.com/problems/{slug}/

## 📘 Problem
{clean_content}

## 🧪 Examples
{formatted_examples}

{ai}

## 📊 Stats
- Runtime: {runtime}
- Memory: {memory}
"""

# ----------------------------
# Save
# ----------------------------
def save_problem(folder, title, slug, details, content, examples):
    os.makedirs(folder, exist_ok=True)

    lang_map = {
        "python": "py",
        "java": "java",
        "cpp": "cpp"
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
        f.write(generate_readme(title, slug, runtime, memory, code, content, examples))

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

        print("Processing:", sub["title"])

        details = get_submission_details(sub_id)
        meta = get_question_meta(sub["titleSlug"])
        content, examples = get_question_details(sub["titleSlug"])

        if not details or not meta:
            continue

        q_id = format_qid(meta["questionId"])
        difficulty = meta["difficulty"]

        folder = f"{q_id}-[{difficulty}]-{sub['titleSlug']}"

        save_problem(folder, sub["title"], sub["titleSlug"], details, content, examples)

        solved_ids.append(q_id)
        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)

        with open("commit_msg.txt", "w") as f:

            f.write("LeetCode : " + ", ".join(solved_ids))

        print("✅ New submissions added")
        print("✅ Updated")
    else:
        if os.path.exists("commit_msg.txt"):
            os.remove("commit_msg.txt")
        print("No new submissions")


if __name__ == "__main__":
    main()