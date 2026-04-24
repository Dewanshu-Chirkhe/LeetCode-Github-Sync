# Maximum Distance Between a Pair of Values

🔗 https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/

## 📘 Problem
You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.

A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.

Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.

An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.

 
Example 1:


Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
Output: 2
Explanation: The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4), and (4,4).
The maximum distance is 2 with pair (2,4).


Example 2:


Input: nums1 = [2,2,2], nums2 = [10,10,1]
Output: 1
Explanation: The valid pairs are (0,0), (0,1), and (1,1).
The maximum distance is 1 with pair (0,1).


Example 3:


Input: nums1 = [30,29,19,5], nums2 = [25,25,25,25,25]
Output: 2
Explanation: The valid pairs are (2,2), (2,3), (2,4), (3,3), and (3,4).
The maximum distance is 2 with pair (2,4).


 
Constraints:


	1 <= nums1.length, nums2.length <= 105
	1 <= nums1[i], nums2[j] <= 105
	Both nums1 and nums2 are non-increasing.

## 🧪 Examples
Example 1:
- Input: [55,30,5,4,2]
- Output: [100,20,10,10,5]

Example 2:
- Input: [2,2,2]
- Output: [10,10,1]

Example 3:
- Input: [30,29,19,5]
- Output: [25,25,25,25,25]

## 🧠 Approach
- Initialize two pointers, `i` and `j`, to the start of `nums1` and `nums2` respectively.
- Compare the elements at `nums1[i]` and `nums2[j]`. If `nums1[i]` is less than or equal to `nums2[j]`, calculate the distance `j-i` and update `maxDist` if necessary, then increment `j`.
- If `nums1[i]` is greater than `nums2[j]`, increment `i`.
- Repeat the comparison and update process until one of the arrays is exhausted.

## ⏱️ Complexity
- Time: O(n + m), where n and m are the lengths of `nums1` and `nums2` respectively.
- Space: O(1), as only a constant amount of space is used to store the pointers and the maximum distance.

## 📊 Stats
- Runtime: 3 ms
- Memory: 86.22 MB
