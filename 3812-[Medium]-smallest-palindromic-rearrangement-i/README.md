# Smallest Palindromic Rearrangement I

🔗 https://leetcode.com/problems/smallest-palindromic-rearrangement-i/

## 📘 Problem
You are given a palindromic string s.

Return the lexicographically smallest palindromic permutation of s.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;z&quot;
  Output: &quot;z&quot;
  Explanation: A string of only one character is already the lexicographically smallest palindrome.

Example 2:
  Input:  s = &quot;babab&quot;
  Output: &quot;abbba&quot;
  Explanation: Rearranging &quot;babab&quot; &rarr; &quot;abbba&quot; gives the smallest lexicographic palindrome.

Example 3:
  Input:  s = &quot;daccad&quot;
  Output: &quot;acddca&quot;
  Explanation: Rearranging &quot;daccad&quot; &rarr; &quot;acddca&quot; gives the smallest lexicographic palindrome.
```

## 📐 Constraints
```
1 <= s.length <= 105
	s consists of lowercase English letters.
	s is guaranteed to be palindromic.
```

## 🧠 Approach
- The given solution sorts the first half of the string and then copies the sorted characters back to the second half in reverse order.
- This approach ensures that the resulting string is a palindrome.
- However, this approach does not consider the original order of characters in the string.
- A more efficient approach would be to find the smallest palindromic rearrangement by sorting the characters and then rearranging them to form a palindrome.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation
- Space: O(n) for the sorting operation and the space required to store the sorted characters

## 📊 Stats
- Runtime: 32 ms
- Memory: 46.09 MB
