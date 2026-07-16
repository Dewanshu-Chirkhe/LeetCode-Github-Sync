# Move Zeroes

🔗 https://leetcode.com/problems/move-zeroes/

## 📘 Problem
Given an integer array nums, move all 0&#39;s to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

## 🧪 Examples
```
Example 1:
  Input:  nums = [0,1,0,3,12]
  Output: [1,3,12,0,0]

Example 2:
  Input:  nums = [0]
  Output: [0]
```

## 📐 Constraints
```
1 <= nums.length <= 104
	-231 <= nums[i] <= 231 - 1

 
Follow up: Could you minimize the total number of operations done?
```

## 🧠 Approach
- Initialize two pointers, `i` and `j`, to track non-zero elements and the current element being processed respectively.
- Iterate through the array with `j`, and when a non-zero element is found, copy it to the `i`th position and increment both `i` and `j`.
- After processing all non-zero elements, fill the remaining positions with zeros by incrementing `i`.
- The array is modified in-place, resulting in all non-zero elements being moved to the front of the array.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 2 ms
- Memory: 45.78 MB
