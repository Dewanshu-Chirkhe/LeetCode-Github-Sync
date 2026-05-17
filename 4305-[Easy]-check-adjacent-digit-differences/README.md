# Check Adjacent Digit Differences

🔗 https://leetcode.com/problems/check-adjacent-digit-differences/

## 📘 Problem
You are given a string s consisting of digits.

Return true if the absolute difference between every pair of adjacent digits is at most 2, otherwise return false.

The absolute difference between a and b is defined as abs(a - b).

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;132&quot;
  Output: true
  Explanation: The absolute difference between digits at s[0] and s[1] is abs(1 - 3) = 2.
	The absolute difference between digits at s[1] and s[2] is abs(3 - 2) = 1.
	Since both differences are at most 2, the answer is true.

Example 2:
  Input:  s = &quot;129&quot;
  Output: false
  Explanation: The absolute difference between digits at s[0] and s[1] is abs(1 - 2) = 1.
	The absolute difference between digits at s[1] and s[2] is abs(2 - 9) = 7, which is greater than 2.
	Therefore, the answer is false.
```

## 📐 Constraints
```
2 <= s.length <= 100
	s consists only of digits.
```

## 🧠 Approach
- The function `isAdjacentDiffAtMostTwo` takes a string `s` as input and checks if the absolute difference between adjacent digits is at most 2.
- It iterates through the string from the first character to the second last character.
- For each pair of adjacent characters, it calculates the absolute difference between them.
- If the difference is greater than 2, it immediately returns `false`.

## ⏱️ Complexity
- Time: O(n), where n is the length of the string, as it needs to iterate through the string once.
- Space: O(1), as it only uses a constant amount of space to store the current and next characters, and their difference.

## 📊 Stats
- Runtime: 1 ms
- Memory: 41.74 MB
