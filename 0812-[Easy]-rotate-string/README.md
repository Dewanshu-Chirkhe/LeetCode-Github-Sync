# Rotate String

🔗 https://leetcode.com/problems/rotate-string/

## 📘 Problem
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

	For example, if s = &quot;abcde&quot;, then it will be &quot;bcdea&quot; after one shift.

## 🧪 Examples
```
Example 1:
  Input:  s = "abcde", goal = "cdeab"
  Output: true

Example 2:
  Input:  s = "abcde", goal = "abced"
  Output: false
```

## 📐 Constraints
```
1 <= s.length, goal.length <= 100
	s and goal consist of lowercase English letters.
```

## 🧠 Approach
- The given solution checks if two strings are rotations of each other by concatenating the first string with itself and checking if the second string is a substring of the concatenated string.
- This approach takes advantage of the fact that a string is a rotation of another string if and only if the concatenated string contains the second string.
- The time complexity of this approach is O(n), where n is the length of the strings, because it involves a single pass through the concatenated string.
- The space complexity is O(n) as well, because it involves creating a new string that is twice the length of the input strings.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 0 ms
- Memory: 40.7 MB
