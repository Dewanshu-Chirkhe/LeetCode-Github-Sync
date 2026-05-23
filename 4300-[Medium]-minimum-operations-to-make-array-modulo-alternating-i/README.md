# Minimum Operations to Make Array Modulo Alternating I

🔗 https://leetcode.com/problems/minimum-operations-to-make-array-modulo-alternating-i/

## 📘 Problem
You are given an integer array nums and an integer k.

In one operation, you can increase or decrease any element of nums by 1.

An array is called modulo alternating if there exist two distinct integers x and y (0 <= x, y < k) such that:

	For every even index i, nums[i] % k == x
	For every odd index i, nums[i] % k == y

Return the minimum number of operations required to make nums modulo alternating.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,4,2,8], k = 3
  Output: 2
  Explanation: Let&#39;s choose x = 1 for even indices and y = 2 for odd indices.
	Perform the following operations:
	
		Increment nums[1] = 4 by 1, giving nums = [1, 5, 2, 8].
		Decrement nums[2] = 2 by 1, giving nums = [1, 5, 1, 8].
	
	
	Now, for even indices, nums[i] % k = 1, and for odd indices, nums[i] % k = 2.
	Thus, the total number of operations required is 2.

Example 2:
  Input:  nums = [1,1,1], k = 3
  Output: 1
  Explanation: Incrementing nums[1] by 1 gives nums = [1, 2, 1], which satisfies the condition with x = 1 and y = 2.
	Thus, the total number of operations required is 1.
```

## 📐 Constraints
```
1 <= nums.length <= 100
	1 <= nums[i] <= 109
	2 <= k <= 100
```

## 🧠 Approach
- The problem is solved using a brute force approach with two nested loops to try all possible pairs of numbers (x, y) where x != y.
- For each pair (x, y), the code calculates the total number of operations required to make the array modulo alternating.
- The operations are calculated by finding the absolute difference between the current number modulo k and the target number (x or y) depending on the index being even or odd.
- The minimum of this difference and k - difference is taken to ensure the minimum number of operations.
- The minimum operations across all pairs (x, y) are stored in the variable ans.

## ⏱️ Complexity
- Time: O(n * k^2), where n is the length of the array and k is the modulo value.
- Space: O(1), as only a constant amount of space is used to store the variables.

## 📊 Stats
- Runtime: 159 ms
- Memory: 43.14 MB
