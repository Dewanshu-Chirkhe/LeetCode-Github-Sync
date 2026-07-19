# Smallest Subsequence of Distinct Characters

🔗 https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

## 📘 Problem
Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;bcabc&quot;
  Output: &quot;abc&quot;

Example 2:
  Input:  s = &quot;cbacdcbc&quot;
  Output: &quot;acdb&quot;
```

## 📐 Constraints
```
1 <= s.length <= 1000
	s consists of lowercase English letters.

 
Note: This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/
```

## 🧠 Approach
- Initialize a frequency array `freq` to store the frequency of each character in the string, and a boolean array `inStack` to keep track of characters in the stack.
- Iterate through the string, decrementing the frequency of each character in `freq` and pushing it to the stack if it's not in the stack and the top of the stack is greater than the current character and its frequency is greater than 0.
- Continue iterating through the string, popping characters from the stack if the top of the stack is greater than the current character and its frequency is greater than 0.
- Build the smallest subsequence by appending characters from the stack to a StringBuilder.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 2 ms
- Memory: 41.11 MB
