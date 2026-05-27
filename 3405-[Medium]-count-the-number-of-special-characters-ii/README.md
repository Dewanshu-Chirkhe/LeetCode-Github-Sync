# Count the Number of Special Characters II

🔗 https://leetcode.com/problems/count-the-number-of-special-characters-ii/

## 📘 Problem
You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.

Return the number of special letters in word.

## 🧪 Examples
```
Example 1:
  Input:  word = &quot;aaAbcBC&quot;
  Output: 3
  Explanation: The special characters are &#39;a&#39;, &#39;b&#39;, and &#39;c&#39;.

Example 2:
  Input:  word = &quot;abc&quot;
  Output: 0
  Explanation: There are no special characters in word.

Example 3:
  Input:  word = &quot;AbBCab&quot;
  Output: 0
  Explanation: There are no special characters in word.
```

## 📐 Constraints
```
1 <= word.length <= 2 * 105
	word consists of only lowercase and uppercase English letters.
```

## 🧠 Approach
- Initialize two arrays, `lastLower` and `firstUpper`, to keep track of the last occurrence of lowercase letters and the first occurrence of uppercase letters in the word, respectively.
- Iterate through the word, updating the arrays based on the case of each character.
- Count the number of pairs of lowercase and uppercase letters that appear in the word, where the lowercase letter appears after the uppercase letter.

## ⏱️ Complexity
- Time: O(n), where n is the length of the word, as we are iterating through the word once.
- Space: O(1), as the size of the arrays is fixed (26) and does not depend on the input size.

## 📊 Stats
- Runtime: 21 ms
- Memory: 46.12 MB
