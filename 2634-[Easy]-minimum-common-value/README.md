# Minimum Common Value

🔗 https://leetcode.com/problems/minimum-common-value/

## 📘 Problem
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

## 🧪 Examples
```
Example 1:
  Input:  nums1 = [1,2,3], nums2 = [2,4]
  Output: 2
  Explanation: The smallest element common to both arrays is 2, so we return 2.

Example 2:
  Input:  nums1 = [1,2,3,6], nums2 = [2,3,4,5]
  Output: 2
  Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
```

## 📐 Constraints
```
1 <= nums1.length, nums2.length <= 105
	1 <= nums1[i], nums2[j] <= 109
	Both nums1 and nums2 are sorted in non-decreasing order.
```

## 🧠 Approach
- Initialize a HashSet to store unique elements from the first array.
- Iterate through the second array and check if each element exists in the HashSet.
- If an element is found in the HashSet, return that element as it's the minimum common value.
- If no common element is found, return -1.

## ⏱️ Complexity
- Time: O(n + m) where n and m are the sizes of the two input arrays.
- Space: O(n) to store unique elements from the first array in the HashSet.

## 📊 Stats
- Runtime: 14 ms
- Memory: 84.61 MB
