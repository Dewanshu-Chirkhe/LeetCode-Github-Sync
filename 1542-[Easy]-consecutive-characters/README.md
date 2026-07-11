# Consecutive Characters

🔗 https://leetcode.com/problems/consecutive-characters/

## 📘 Problem
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;leetcode&quot;
  Output: 2
  Explanation: The substring &quot;ee&quot; is of length 2 with the character &#39;e&#39; only.

Example 2:
  Input:  s = &quot;abbcccddddeeeeedcba&quot;
  Output: 5
  Explanation: The substring &quot;eeeee&quot; is of length 5 with the character &#39;e&#39; only.
```

## 📐 Constraints
```
1 <= s.length <= 500
	s consists of only lowercase English letters.
```

## 🧠 Approach
- Initialize variables to keep track of the maximum length of consecutive characters and the current length of consecutive characters.
- Iterate through the string, comparing each character with the previous one.
- If the characters match, increment the current length; otherwise, reset it to 1.
- Update the maximum length if the current length exceeds it.

## ⏱️ Complexity
- Time: O(n), where n is the length of the string, as we only need to iterate through the string once.
- Space: O(1), as we only use a constant amount of space to store the variables, regardless of the input size.

## 📊 Stats
- Runtime: 1 ms
- Memory: 41.1 MB
