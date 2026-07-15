# GCD of Odd and Even Sums

🔗 https://leetcode.com/problems/gcd-of-odd-and-even-sums/

## 📘 Problem
You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

	
	sumOdd: the sum of the smallest n positive odd numbers.
	
	
	sumEven: the sum of the smallest n positive even numbers.
	

Return the GCD of sumOdd and sumEven.

## 🧪 Examples
```
Example 1:
  Input:  n = 4
  Output: 4
  Explanation: Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
	Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20

Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

Example 2:
  Input:  n = 5
  Output: 5
  Explanation: Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
	Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30

Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.
```

## 📐 Constraints
```
1 <= n <= 10​​​​​​​00
```

## 🧠 Approach
- Calculate the sum of all odd numbers from 1 to 2n and the sum of all even numbers from 1 to 2n.
- Use the Euclidean algorithm to find the GCD of the two sums.
- The Euclidean algorithm works by repeatedly applying the property that the GCD of two numbers a and b is the same as the GCD of b and the remainder of a divided by b.
- The base case for the Euclidean algorithm is when b is 0, in which case the GCD is a.

## ⏱️ Complexity
- Time: O(n) - The time complexity is O(n) because we are iterating from 1 to 2n to calculate the sums.
- Space: O(1) - The space complexity is O(1) because we are using a constant amount of space to store the sums and the GCD.

## 📊 Stats
- Runtime: 3 ms
- Memory: 40.62 MB
