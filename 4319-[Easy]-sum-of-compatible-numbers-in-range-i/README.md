# Sum of Compatible Numbers in Range I

🔗 https://leetcode.com/problems/sum-of-compatible-numbers-in-range-i/

## 📘 Problem
You are given two integers n and k.

A positive integer x is called compatible if it satisfies both of the following conditions:

	abs(n - x) <= k
	(n &amp; x) == 0

Return the sum of all compatible integers x.

Note:

	Here, &amp; denotes the bitwise AND operator.
	The absolute difference between integers i and j is defined as abs(i - j).

## 🧪 Examples
```
Example 1:
  Input:  n = 2, k = 3
  Output: 10
  Explanation: The compatible integers are:

	x = 1, since abs(2 - 1) = 1 and 2 &amp; 1 = 0.
	x = 4, since abs(2 - 4) = 2 and 2 &amp; 4 = 0.
	x = 5, since abs(2 - 5) = 3 and 2 &amp; 5 = 0.

Thus, the answer is 1 + 4 + 5 = 10.

Example 2:
  Input:  n = 5, k = 1
  Output: 0
  Explanation: There are no compatible integers in the range [4, 6]. Thus, the answer is 0.
```

## 📐 Constraints
```
1 <= n <= 100
	1 <= k <= 100
```

## 🧠 Approach
- The solution uses a brute force approach to find all numbers within the given range that are compatible with the target number `n`.
- It iterates over the range from `start` to `end` and checks each number `x` to see if it is compatible with `n`.
- A number `x` is considered compatible if the absolute difference between `n` and `x` is less than or equal to `k` and the bitwise AND of `n` and `x` is 0.
- The sum of all compatible numbers is then returned.

## ⏱️ Complexity
- Time: O(n-k)
- Space: O(1)

## 📊 Stats
- Runtime: 1 ms
- Memory: 40.8 MB
