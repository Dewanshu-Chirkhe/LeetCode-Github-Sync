import requests
import os

SESSION = os.getenv("LEETCODE_SESSION")
CSRF = os.getenv("LEETCODE_CSRF")

URL = "https://leetcode.com/graphql"

headers = {
    "Content-Type": "application/json",
    "Cookie": f"LEETCODE_SESSION={SESSION}; csrftoken={CSRF}",
    "x-csrftoken": CSRF,
    "Referer": "https://leetcode.com",
}

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
        query {
          recentAcSubmissionList {
            id
            title
            titleSlug
            questionId
          }
        }
        """
    }

    res = requests.post(URL, json=query, headers=headers)

    if res.status_code != 200:
        print("❌ Failed to fetch submissions")
        print(res.text)
        return []

    data = res.json()

    if "errors" in data:
        print("❌ Session expired or invalid")
        return []

    return data["data"]["recentAcSubmissionList"]


def get_submission_details(sub_id):
    query = {
        "query": """
        query submissionDetails($id: Int!) {
          submissionDetails(submissionId: $id) {
            code
            runtime
            memory
            lang
          }
        }
        """,
        "variables": {"id": int(sub_id)}
    }

    res = requests.post(URL, json=query, headers=headers)
    data = res.json()

    if "errors" in data:
        print(f"❌ Failed details for {sub_id}")
        return None

    return data["data"]["submissionDetails"]


# ----------------------------
# README
# ----------------------------
def generate_readme(title, runtime, memory):
    return f"""# {title}

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
def save_problem(folder, title, details):
    os.makedirs(folder, exist_ok=True)

    lang_map = {
        "python": "py",
        "python3": "py",
        "java": "java",
        "cpp": "cpp",
        "c": "c",
        "javascript": "js"
    }

    ext = lang_map.get(details["lang"].lower(), "txt")

    with open(f"{folder}/solution.{ext}", "w", encoding="utf-8") as f:
        f.write(details["code"])

    with open(f"{folder}/README.md", "w", encoding="utf-8") as f:
        f.write(generate_readme(title, details["runtime"], details["memory"]))


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

        folder = f"{sub['questionId']}-{sub['titleSlug']}"
        save_problem(folder, sub["title"], details)

        # Commit message entry
        msg = f"{sub['questionId']}. {sub['title']} ({details['lang']})"
        commit_messages.append(msg)

        seen.add(sub_id)
        updated = True

    if updated:
        save_seen(seen)

        # Write commit message
        with open("commit_msg.txt", "w") as f:
            f.write("Add: " + ", ".join(commit_messages))

        print("✅ New submissions added")
    else:
        print("No new submissions")


if __name__ == "__main__":
    main()