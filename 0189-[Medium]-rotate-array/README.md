# Rotate Array

🔗 https://leetcode.com/problems/rotate-array/

## 📘 Problem
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,2,3,4,5,6,7], k = 3
  Output: [5,6,7,1,2,3,4]
  Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
  Input:  nums = [-1,-100,3,99], k = 2
  Output: [3,99,-1,-100]
  Explanation: rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

## 📐 Constraints
```
1 <= nums.length <= 105
	-231 <= nums[i] <= 231 - 1
	0 <= k <= 105

 
Follow up:

	Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
	Could you do it in-place with O(1) extra space?
```

## 🧠 Approach
- The problem is solved by reversing the entire array first, then reversing the first k elements, and finally reversing the rest of the array.
- This approach takes advantage of the fact that reversing a subarray is equivalent to reversing the entire array and then reversing the rest of the array.
- The `reverse` function is used to reverse a subarray within the array.
- The `rotate` function takes an array and an integer k as input, and modifies the array in-place to rotate it by k positions.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 58.35 MB
