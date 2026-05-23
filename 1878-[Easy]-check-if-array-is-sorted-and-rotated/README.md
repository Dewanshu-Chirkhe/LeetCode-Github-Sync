# Check if Array Is Sorted and Rotated

🔗 https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

## 📘 Problem
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

## 🧪 Examples
```
Example 1:
  Input:  nums = [3,4,5,1,2]
  Output: true
  Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

Example 2:
  Input:  nums = [2,1,3,4]
  Output: false
  Explanation: There is no sorted array once rotated that can make nums.

Example 3:
  Input:  nums = [1,2,3]
  Output: true
  Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
```

## 📐 Constraints
```
1 <= nums.length <= 100
	1 <= nums[i] <= 100
```

## 🧠 Approach
- The given solution checks if the array is sorted and rotated by comparing each element with its next element in a circular manner.
- It uses a variable `drop` to count the number of times a larger element is found after a smaller element.
- If `drop` exceeds 1, it means the array is not sorted and rotated, so the function returns `false`.
- If the loop completes without finding more than one such pair, the function returns `true`, indicating that the array is sorted and rotated.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 41.06 MB
