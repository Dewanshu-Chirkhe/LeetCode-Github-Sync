# Count the Number of Special Characters I

🔗 https://leetcode.com/problems/count-the-number-of-special-characters-i/

## 📘 Problem
You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.

## 🧪 Examples
```
Example 1:
  Input:  word = &quot;aaAbcBC&quot;
  Output: 3
  Explanation: The special characters in word are &#39;a&#39;, &#39;b&#39;, and &#39;c&#39;.

Example 2:
  Input:  word = &quot;abc&quot;
  Output: 0
  Explanation: No character in word appears in uppercase.

Example 3:
  Input:  word = &quot;abBCab&quot;
  Output: 1
  Explanation: The only special character in word is &#39;b&#39;.
```

## 📐 Constraints
```
1 <= word.length <= 50
	word consists of only lowercase and uppercase English letters.
```

## 🧠 Approach
- Initialize a set to store unique lowercase characters and a counter for special characters.
- Iterate through the string, and for each character, check if it's already in the set. If it is, skip to the next character.
- If the character is lowercase, iterate through the string again to find its uppercase counterpart. If found, increment the counter and add the lowercase character to the set.
- Return the count of special characters.

## ⏱️ Complexity
- Time: O(n^2) due to the nested loop in the worst case scenario.
- Space: O(n) for storing unique characters in the set.

## 📊 Stats
- Runtime: 2 ms
- Memory: 41.4 MB
