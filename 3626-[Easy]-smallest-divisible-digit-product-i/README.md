# Smallest Divisible Digit Product I

🔗 https://leetcode.com/problems/smallest-divisible-digit-product-i/

## 📘 Problem
You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.

## 🧪 Examples
```
Example 1:
  Input:  n = 10, t = 2
  Output: 10
  Explanation: The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.

Example 2:
  Input:  n = 15, t = 3
  Output: 16
  Explanation: The digit product of 16 is 6, which is divisible by 3, making it the smallest number greater than or equal to 15 that satisfies the condition.
```

## 📐 Constraints
```
1 <= n <= 100
	1 <= t <= 10
```

## 🧠 Approach
- The problem requires finding the smallest number that is divisible by a given digit product.
- The solution uses a helper function `isPossible` to check if a number is divisible by the digit product.
- The `smallestNumber` function increments the number until it finds one that is divisible by the digit product.
- The digit product is calculated by multiplying the last digit of the number, then the last two digits, and so on.

## ⏱️ Complexity
- Time: O(log(n)) because the while loop in `smallestNumber` function runs until the number is divisible by the digit product, and the number of digits in a number is logarithmic to the number itself.
- Space: O(1) because the space complexity is constant, regardless of the input size.

## 📊 Stats
- Runtime: 1 ms
- Memory: 40.5 MB
