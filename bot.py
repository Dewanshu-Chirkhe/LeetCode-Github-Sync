import requests
import os

SESSION = os.getenv("LEETCODE_SESSION")
CSRF = os.getenv("LEETCODE_CSRF")

URL = "https://leetcode.com/graphql"

headers = {
    "Content-Type": "application/json",
    "Referer": "https://leetcode.com",
}

# Add cookies only if available (safe fallback)
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
        print(data)
        return None

    return data["data"]["submissionDetails"]


# ----------------------------
# README
# ----------------------------
def generate_readme(title, slug, runtime, memory):
    return f"""# {title}

🔗 https://leetcode.com/problems/{slug}/

## 🧠 Approach
<!-- Write your approach here -->

## ⏱️ Complexity
- Time: O(?)
- Space: O(?)

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

    # Fix formatting (important)
    code = code.replace("\\n", "\n")

    with open(f"{folder}/solution.{ext}", "w", encoding="utf-8") as f:
        f.write(code)

    with open(f"{folder}/README.md", "w", encoding="utf-8") as f:
        f.write(generate_readme(title, slug, runtime, memory))


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

        folder = f"{sub['titleSlug']}"
        save_problem(folder, sub["title"], sub["titleSlug"], details)

        lang = details["lang"]["name"]
        msg = f"{sub['title']} ({lang})"
        commit_messages.append(msg)

        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)

        with open("commit_msg.txt", "w") as f:
            f.write("Add: " + ", ".join(commit_messages))

        print("✅ New submissions added")
    else:
        print("No new submissions")


if __name__ == "__main__":
    main()