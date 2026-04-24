# Minimum Absolute Distance Between Mirror Pairs

🔗 https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/

## 📘 Problem
You are given an integer array nums.

A mirror pair is a pair of indices (i, j) such that:


	0 <= i < j < nums.length, and
	reverse(nums[i]) == nums[j], where reverse(x) denotes the integer formed by reversing the digits of x. Leading zeros are omitted after reversing, for example reverse(120) = 21.


Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).

If no mirror pair exists, return -1.

 
Example 1:


Input: nums = [12,21,45,33,54]

Output: 1

Explanation:

The mirror pairs are:


	(0, 1) since reverse(nums[0]) = reverse(12) = 21 = nums[1], giving an absolute distance abs(0 - 1) = 1.
	(2, 4) since reverse(nums[2]) = reverse(45) = 54 = nums[4], giving an absolute distance abs(2 - 4) = 2.


The minimum absolute distance among all pairs is 1.


Example 2:


Input: nums = [120,21]

Output: 1

Explanation:

There is only one mirror pair (0, 1) since reverse(nums[0]) = reverse(120) = 21 = nums[1].

The minimum absolute distance is 1.


Example 3:


Input: nums = [21,120]

Output: -1

Explanation:

There are no mirror pairs in the array.


 
Constraints:


	1 <= nums.length <= 105
	1 <= nums[i] <= 109​​​​​​​

## 🧪 Examples
Example 1:
- Input: [12,21,45,33,54]
- Output: [120,21]

## 🧠 Approach
- The solution uses a HashMap to store the indices of the numbers in the array.
- It iterates through the array, and for each number, it checks if its reverse is already in the HashMap.
- If the reverse is found, it calculates the distance between the current index and the index of the reverse in the HashMap.
- The minimum distance is updated accordingly, and if no mirror pair is found, it returns -1.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 51 ms
- Memory: 90.66 MB
