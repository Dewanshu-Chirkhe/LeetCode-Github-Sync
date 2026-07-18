# Find Greatest Common Divisor of Array

🔗 https://leetcode.com/problems/find-greatest-common-divisor-of-array/

## 📘 Problem
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

## 🧪 Examples
```
Example 1:
  Input:  nums = [2,5,6,9,10]
  Output: 2
  Explanation: The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
  Input:  nums = [7,5,6,8,3]
  Output: 1
  Explanation: The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

Example 3:
  Input:  nums = [3,3]
  Output: 3
  Explanation: The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
```

## 📐 Constraints
```
2 <= nums.length <= 1000
	1 <= nums[i] <= 1000
```

## 🧠 Approach
- The problem is solved by first finding the maximum and minimum values in the array, as the GCD of an array is the same as the GCD of its maximum and minimum values.
- The GCD of two numbers is found using the Euclidean algorithm, which is implemented in the `gcd` function.
- The `findGCD` function iterates over the array to find the maximum and minimum values, and then calls the `gcd` function to find the GCD of these two values.
- The GCD function uses recursion to find the GCD of two numbers, with a base case of returning the non-zero number when the other number is zero.

## ⏱️ Complexity
- Time: O(n + log(max)), where n is the number of elements in the array and max is the maximum value in the array.
- Space: O(log(max)), as the space complexity of the recursive GCD function is proportional to the logarithm of the maximum value.

## 📊 Stats
- Runtime: 0 ms
- Memory: 42.98 MB
