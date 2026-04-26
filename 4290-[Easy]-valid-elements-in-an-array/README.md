# Valid Elements in an Array

🔗 https://leetcode.com/problems/valid-elements-in-an-array/

## 📘 Problem
You are given an integer array nums.

An element nums[i] is considered valid if it satisfies at least one of the following conditions:


	It is strictly greater than every element to its left.
	It is strictly greater than every element to its right.


The first and last elements are always valid.

Return an array of all valid elements in the same order as they appear in nums.

 
Example 1:


Input: nums = [1,2,4,2,3,2]

Output: [1,2,4,3,2]

Explanation:


	nums[0] and nums[5] are always valid.
	nums[1] and nums[2] are strictly greater than every element to their left.
	nums[4] is strictly greater than every element to its right.
	Thus, the answer is [1, 2, 4, 3, 2].



Example 2:


Input: nums = [5,5,5,5]

Output: [5,5]

Explanation:


	The first and last elements are always valid.
	No other elements are strictly greater than all elements to their left or to their right.
	Thus, the answer is [5, 5].



Example 3:


Input: nums = [1]

Output: [1]

Explanation:

Since there is only one element, it is always valid. Thus, the answer is [1].


 
Constraints:


	1 <= nums.length <= 100
	1 <= nums[i] <= 100

## 🧪 Examples
Example 1:
- Input: [1,2,4,2,3,2]
- Output: [5,5,5,5]

## 🧠 Approach
- The problem is solved using two arrays, `leftMax` and `rightMax`, to store the maximum element to the left and right of each index in the input array `nums`.
- The `leftMax` array is filled from left to right, and the `rightMax` array is filled from right to left.
- Then, for each element in the input array, it checks if the element is greater than the maximum element to its left and right. If it is, the element is added to the result list `ans`.
- This approach ensures that all valid elements in the array are found and added to the result list.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.77 MB
