# Limit Occurrences in Sorted Array

🔗 https://leetcode.com/problems/limit-occurrences-in-sorted-array/

## 📘 Problem
You are given a sorted integer array nums and an integer k.

Return an array such that each distinct element appears at most k times, while preserving the relative order of the elements in nums.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,1,1,2,2,3], k = 2
  Output: [1,1,2,2,3]
  Explanation: Each element can appear at most 2 times.

	The element 1 appears 3 times, so only 2 occurrences are kept.
	The element 2 appears 2 times, so both occurrences are kept.
	The element 3 appears 1 time, so it is kept.

Thus, the resulting array is [1, 1, 2, 2, 3].

Example 2:
  Input:  nums = [1,2,3], k = 1
  Output: [1,2,3]
  Explanation: All elements are distinct and already appear at most once, so the array remains unchanged.
```

## 📐 Constraints
```
1 <= nums.length <= 100
	1 <= nums[i] <= 100
	nums is sorted in non-decreasing order.
	1 <= k <= nums.length

 
Follow-up:

	Can you solve this in-place using O(1) extra space?
	Note that the space used for returning or resizing the result does not count toward the space complexity mentioned above, as some languages do not support in-place resizing.
```

## 🧠 Approach
- The problem is solved by first counting the frequency of each element in the array using a HashMap.
- Then, for each unique element, we add it to the result list up to the minimum of its frequency and the given limit k.
- Finally, we convert the list to an array, sort it, and return the result.

## ⏱️ Complexity
- Time: O(n + m), where n is the length of the array and m is the number of unique elements.
- Space: O(n + m), where n is the length of the array and m is the number of unique elements.

## 📊 Stats
- Runtime: 8 ms
- Memory: 45.41 MB
