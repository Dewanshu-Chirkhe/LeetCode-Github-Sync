# Squares of a Sorted Array

🔗 https://leetcode.com/problems/squares-of-a-sorted-array/

## 📘 Problem
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

## 🧪 Examples
```
Example 1:
  Input:  nums = [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
  Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
  Input:  nums = [-7,-3,2,3,11]
  Output: [4,9,9,49,121]
```

## 📐 Constraints
```
1 <= nums.length <= 104
	-104 <= nums[i] <= 104
	nums is sorted in non-decreasing order.

 
Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
```

## 🧠 Approach
- Initialize an array `ans` of the same length as the input array `nums` to store the squares of the elements.
- Iterate through each element in `nums`, square it, and store the result in the corresponding index in `ans`.
- Sort the `ans` array in ascending order.
- Return the sorted `ans` array.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation.
- Space: O(n) for the additional space required to store the squared elements.

## 📊 Stats
- Runtime: 10 ms
- Memory: 46.58 MB
