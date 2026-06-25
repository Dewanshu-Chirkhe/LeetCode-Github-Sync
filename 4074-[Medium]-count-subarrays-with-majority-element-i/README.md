# Count Subarrays With Majority Element I

🔗 https://leetcode.com/problems/count-subarrays-with-majority-element-i/

## 📘 Problem
You are given an integer array nums and an integer target.

Return the number of subarrays of nums in which target is the majority element.

The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,2,2,3], target = 2
  Output: 5
  Explanation: Valid subarrays with target = 2 as the majority element:

	nums[1..1] = [2]
	nums[2..2] = [2]
	nums[1..2] = [2,2]
	nums[0..2] = [1,2,2]
	nums[1..3] = [2,2,3]

So there are 5 such subarrays.

Example 2:
  Input:  nums = [1,1,1,1], target = 1
  Output: 10
  Explanation: ​​​​​​​All 10 subarrays have 1 as the majority element.

Example 3:
  Input:  nums = [1,2,3], target = 4
  Output: 0
  Explanation: target = 4 does not appear in nums at all. Therefore, there cannot be any subarray where 4 is the majority element. Hence the answer is 0.
```

## 📐 Constraints
```
1 <= nums.length <= 1000
	1 <= nums[i] <= 10​​​​​​​9
	1 <= target <= 109
```

## 🧠 Approach
- The problem is solved using a sliding window approach with a hash map to store the frequency of elements in the current window.
- For each starting index, we expand the window to the right and update the frequency of elements in the hash map.
- We check if the frequency of the target element is more than half of the window size, and if so, we increment the answer.
- This process is repeated for all possible starting indices.

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(n)

## 📊 Stats
- Runtime: 1160 ms
- Memory: 45.06 MB
