# Maximum Product of Two Digits

🔗 https://leetcode.com/problems/maximum-product-of-two-digits/

## 📘 Problem
You are given a positive integer n.

Return the maximum product of any two digits in n.

Note: You may use the same digit twice if it appears more than once in n.

## 🧪 Examples
```
Example 1:
  Input:  n = 31
  Output: 3
  Explanation: The digits of n are [3, 1].
	The possible products of any two digits are: 3 * 1 = 3.
	The maximum product is 3.

Example 2:
  Input:  n = 22
  Output: 4
  Explanation: The digits of n are [2, 2].
	The possible products of any two digits are: 2 * 2 = 4.
	The maximum product is 4.

Example 3:
  Input:  n = 124
  Output: 8
  Explanation: The digits of n are [1, 2, 4].
	The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
	The maximum product is 8.
```

## 📐 Constraints
```
10 <= n <= 109
```

## 🧠 Approach
- The problem is solved by first converting the given integer into a queue of its digits using a priority queue.
- The priority queue is used with a reverse order to ensure that the largest digits are at the top.
- The product of the two largest digits is then calculated by polling the top two elements from the queue.
- This approach ensures that the maximum product of two digits is obtained.

## ⏱️ Complexity
- Time: O(log(n)) where n is the given integer, as we are iterating over the digits of the number.
- Space: O(log(n)) as we are storing the digits of the number in the priority queue.

## 📊 Stats
- Runtime: 2 ms
- Memory: 40.65 MB
