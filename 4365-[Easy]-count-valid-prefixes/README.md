# Count Valid Prefixes

🔗 https://leetcode.com/problems/count-valid-prefixes/

## 📘 Problem
You are given a binary string s.

A prefix of s is considered valid if its characters can be rearranged to form an alternating string.

Return the number of valid prefixes of s.

A binary string is a string consisting only of &#39;0&#39; and &#39;1&#39;.

A prefix of a string is a substring that starts from the beginning of the string and extends to any point within it.

A substring is a contiguous non-empty sequence of characters within a string.

A string is considered alternating if no two adjacent characters are equal.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;00101&quot;
  Output: 3
  Explanation: The valid prefixes are:

	&quot;0&quot;: It is already an alternating string.
	&quot;001&quot;: It can be rearranged into &quot;010&quot;, which is an alternating string.
	&quot;00101&quot;: It can be rearranged into &quot;01010&quot;, which is an alternating string.

Thus, the answer is 3.

Example 2:
  Input:  s = &quot;101&quot;
  Output: 3
  Explanation: All prefixes of s = &quot;101&quot; are already alternating strings. Thus, the answer is 3.
```

## 📐 Constraints
```
1 <= s.length <= 100
	s consists only of &#39;0&#39; and &#39;1&#39;.
```

## 🧠 Approach
- The problem is solved by iterating over the string and maintaining a count of '1's and '0's.
- For each character, the absolute difference between the counts of '1's and '0's is checked. If the difference is 1 or if the counts are equal, it means a valid prefix is formed.
- The count of valid prefixes is incremented in such cases.
- The function returns the total count of valid prefixes.

## ⏱️ Complexity
- Time: O(n), where n is the length of the string, as we are iterating over the string once.
- Space: O(1), as we are using a constant amount of space to store the counts of '1's and '0's.

## 📊 Stats
- Runtime: 1 ms
- Memory: 42.0 MB
