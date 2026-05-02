# Rotated Digits

🔗 https://leetcode.com/problems/rotated-digits/

## 📘 Problem
An integer x is a good if after rotating each digit individually by 180 degrees, we get a valid number that is different from x. Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. For example:

	0, 1, and 8 rotate to themselves,
	2 and 5 rotate to each other (in this case they are rotated in a different direction, in other words, 2 or 5 gets mirrored),
	6 and 9 rotate to each other, and
	the rest of the numbers do not rotate to any other number and become invalid.

Given an integer n, return the number of good integers in the range [1, n].

## 🧪 Examples
```
Example 1:
  Input:  n = 10
  Output: 4
  Explanation: There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

Example 2:
  Input:  n = 1
  Output: 0

Example 3:
  Input:  n = 2
  Output: 1
```

## 📐 Constraints
```
1 <= n <= 104
```

## 🧠 Approach
- The problem is solved by iterating through all numbers from 1 to n and checking if they can be rotated to form a valid number.
- A set of valid digits (2, 5, 6, 9) and a set of invalid digits (3, 4, 7) are used to determine if a number can be rotated to a valid number.
- For each number, it checks if any of its digits are in the invalid set, if so, it breaks the loop and moves to the next number.
- If the number has any digits in the valid set and none in the invalid set, it increments the count.

## ⏱️ Complexity
- Time: O(n * log(n))
- Space: O(1)

## 📊 Stats
- Runtime: 11 ms
- Memory: 40.46 MB
