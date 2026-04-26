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
USERNAME = "Dewanshu-Chirkhe"

headers = {
    "Content-Type": "application/json",
    "Referer": "https://leetcode.com",
}

if SESSION and CSRF:
    headers["Cookie"] = f"LEETCODE_SESSION={SESSION}; csrftoken={CSRF}"
    headers["x-csrftoken"] = CSRF

LANG_EXT = {"python": "py", "java": "java", "cpp": "cpp"}

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


def clean_html(html):
    if not html:
        return "Not available"
    text = re.sub(r"<.*?>", "", html)
    text = text.replace("&nbsp;", " ").replace("&lt;", "<").replace("&gt;", ">")
    text = re.sub(r"\n{3,}", "\n\n", text)
    return text.strip()

# ----------------------------
# Fetch submissions
# ----------------------------
def get_recent_submissions():
    query = {
        "query": """
        query getRecent($username: String!) {
          recentAcSubmissionList(username: $username) {
            id title titleSlug timestamp
          }
        }
        """,
        "variables": {"username": USERNAME},
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
            code runtime memory
            lang { name }
          }
        }
        """,
        "variables": {"id": int(sub_id)},
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
            questionId difficulty
          }
        }
        """,
        "variables": {"titleSlug": slug},
    }
    res = requests.post(URL, json=query, headers=headers)
    data = res.json()
    if "errors" in data:
        return None
    return data["data"]["question"]

# ----------------------------
# Question content
# ----------------------------
def get_question_details(slug):
    query = {
        "query": """
        query getQuestionDetail($titleSlug: String!) {
          question(titleSlug: $titleSlug) {
            content exampleTestcases
          }
        }
        """,
        "variables": {"titleSlug": slug},
    }
    res = requests.post(URL, json=query, headers=headers)
    data = res.json()
    if "errors" in data or not data["data"]["question"]:
        return None, None
    q = data["data"]["question"]
    return q["content"], q["exampleTestcases"]

# ----------------------------
# Parse HTML into sections:
#   description | examples (code block) | constraints (code block)
# ----------------------------
def parse_content(html_content):
    if not html_content:
        return "Not available", "Not available", "Not available"

    text = clean_html(html_content)

    # Split off description (everything before first Example)
    desc_split = re.split(r"Example\s+1\s*:", text, maxsplit=1)
    description = desc_split[0].strip() if len(desc_split) > 1 else text.strip()

    # Remainder = examples + constraints
    after_desc = ("Example 1:" + desc_split[1]) if len(desc_split) > 1 else ""

    # Split examples from constraints
    constraints_split = re.split(r"Constraints\s*:", after_desc, maxsplit=1)
    examples_raw = constraints_split[0].strip() if constraints_split else ""
    constraints_raw = constraints_split[1].strip() if len(constraints_split) > 1 else ""

    # Parse individual example blocks into a single fenced code block
    pattern = r"(Example\s+\d+\s*:[\s\S]*?)(?=Example\s+\d+\s*:|$)"
    matches = re.findall(pattern, examples_raw)

    blocks = []
    for i, ex in enumerate(matches, 1):
        ex = re.sub(r"^Example\s+\d+\s*:", "", ex).strip()

        input_m = re.search(r"Input:\s*(.*)", ex)
        output_m = re.search(r"Output:\s*(.*)", ex)
        explain_m = re.search(r"Explanation:\s*([\s\S]*?)(?=\n[A-Z][a-zA-Z ]*:|$)", ex)

        input_val = input_m.group(1).strip() if input_m else ""
        output_val = output_m.group(1).strip() if output_m else ""
        explanation_val = explain_m.group(1).strip() if explain_m else ""

        lines = [f"Example {i}:", f"  Input:  {input_val}", f"  Output: {output_val}"]
        if explanation_val:
            lines.append(f"  Explanation: {explanation_val}")

        blocks.append("\n".join(lines))

    examples_block = "```\n" + "\n\n".join(blocks) + "\n```" if blocks else "Not available"
    constraints_block = "```\n" + constraints_raw + "\n```" if constraints_raw else "Not available"

    return description, examples_block, constraints_block

# ----------------------------
# AI README
# ----------------------------
def generate_ai_readme(title, code):
    fallback = (
        "## 🧠 Approach\n"
        "- Identify core logic\n"
        "- Use proper data structure\n"
        "- Optimize traversal\n"
        "- Return result\n\n"
        "## ⏱️ Complexity\n"
        "- Time: O(N)\n"
        "- Space: O(1)"
    )

    if not GROQ_API_KEY:
        return fallback

    prompt = (
        f"Problem: {title}\n\nGiven solution:\n{code}\n\n"
        "STRICT RULES:\n- EXACTLY 4 bullet points\n- No paragraphs\n\n"
        "Format:\n\n## 🧠 Approach\n- Point 1\n- Point 2\n- Point 3\n- Point 4\n\n"
        "## ⏱️ Complexity\n- Time: O(...)\n- Space: O(...)"
    )

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
                "temperature": 0,
            },
        )
        res.raise_for_status()
        return res.json()["choices"][0]["message"]["content"]
    except Exception as e:
        print(f"⚠️ AI README generation failed: {e}")
        return fallback

# ----------------------------
# README generator
# ----------------------------
def generate_readme(title, slug, runtime, memory, code, html_content):
    description, examples_block, constraints_block = parse_content(html_content)
    ai_section = generate_ai_readme(title, code)

    return (
        f"# {title}\n\n"
        f"🔗 https://leetcode.com/problems/{slug}/\n\n"
        f"## 📘 Problem\n{description}\n\n"
        f"## 🧪 Examples\n{examples_block}\n\n"
        f"## 📐 Constraints\n{constraints_block}\n\n"
        f"{ai_section}\n\n"
        f"## 📊 Stats\n"
        f"- Runtime: {runtime}\n"
        f"- Memory: {memory}\n"
    )

# ----------------------------
# Save
# ----------------------------
def save_problem(folder, title, slug, details, html_content):
    os.makedirs(folder, exist_ok=True)

    lang = details["lang"]["name"].lower()
    ext = LANG_EXT.get(lang, "txt")
    code = details["code"].replace("\\n", "\n")

    raw_runtime = details.get("runtime", "N/A")
    runtime = f"{raw_runtime} ms" if raw_runtime != "N/A" else "N/A"

    raw_memory = details.get("memory", "N/A")
    if raw_memory != "N/A":
        memory = f"{round(raw_memory / (1024 * 1024), 2)} MB"
    else:
        memory = "N/A"

    filename = to_camel_case(slug)

    with open(f"{folder}/{filename}.{ext}", "w", encoding="utf-8") as f:
        f.write(code)

    with open(f"{folder}/README.md", "w", encoding="utf-8") as f:
        f.write(generate_readme(title, slug, runtime, memory, code, html_content))

# ----------------------------
# Main
# ----------------------------
def main():
    seen = load_seen()
    updated = False
    solved_ids = []

    for sub in get_recent_submissions():
        sub_id = sub["id"]
        if sub_id in seen:
            continue

        print(f"Processing: {sub['title']}")

        details = get_submission_details(sub_id)
        meta = get_question_meta(sub["titleSlug"])
        content, _ = get_question_details(sub["titleSlug"])

        if not details or not meta:
            continue

        q_id = format_qid(meta["questionId"])
        difficulty = meta["difficulty"]
        folder = f"{q_id}-[{difficulty}]-{sub['titleSlug']}"

        save_problem(folder, sub["title"], sub["titleSlug"], details, content)

        solved_ids.append(q_id)
        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)
        with open("commit_msg.txt", "w") as f:
            f.write("LeetCode : " + ", ".join(solved_ids))
        print("✅ Done —", ", ".join(solved_ids))
    else:
        print("No new submissions")


if __name__ == "__main__":
    main()