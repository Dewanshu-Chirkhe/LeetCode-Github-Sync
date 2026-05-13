# Pow(x, n)

🔗 https://leetcode.com/problems/powx-n/

## 📘 Problem
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

## 🧪 Examples
```
Example 1:
  Input:  x = 2.00000, n = 10
  Output: 1024.00000

Example 2:
  Input:  x = 2.10000, n = 3
  Output: 9.26100

Example 3:
  Input:  x = 2.00000, n = -2
  Output: 0.25000
  Explanation: 2-2 = 1/22 = 1/4 = 0.25
```

## 📐 Constraints
```
-100.0 < x < 100.0
	-231 <= n <= 231-1
	n is an integer.
	Either x is not zero or n > 0.
	-104 <= xn <= 104
```

## 🧠 Approach
- The problem is solved using a recursive approach with memoization.
- The function `pow` calculates the power of `x` to `n/2` and then squares the result if `n` is even, or squares the result and multiplies by `x` if `n` is odd.
- The function `myPow` handles the case where `n` is negative by inverting `x` and making `n` positive.
- The function `myPow` also converts the integer `n` to a long to avoid overflow.

## ⏱️ Complexity
- Time: O(log(n))
- Space: O(log(n))

## 📊 Stats
- Runtime: 0 ms
- Memory: 45.79 MB
