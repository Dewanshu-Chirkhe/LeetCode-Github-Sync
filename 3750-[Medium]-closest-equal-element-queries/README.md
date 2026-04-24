# Closest Equal Element Queries

🔗 https://leetcode.com/problems/closest-equal-element-queries/

## 📘 Problem
You are given a circular array nums and an array queries.

For each query i, you have to find the following:


	The minimum distance between the element at index queries[i] and any other index j in the circular array, where nums[j] == nums[queries[i]]. If no such index exists, the answer for that query should be -1.


Return an array answer of the same size as queries, where answer[i] represents the result for query i.

 
Example 1:


Input: nums = [1,3,1,4,1,3,2], queries = [0,3,5]

Output: [2,-1,3]

Explanation:


	Query 0: The element at queries[0] = 0 is nums[0] = 1. The nearest index with the same value is 2, and the distance between them is 2.
	Query 1: The element at queries[1] = 3 is nums[3] = 4. No other index contains 4, so the result is -1.
	Query 2: The element at queries[2] = 5 is nums[5] = 3. The nearest index with the same value is 1, and the distance between them is 3 (following the circular path: 5 -> 6 -> 0 -> 1).



Example 2:


Input: nums = [1,2,3,4], queries = [0,1,2,3]

Output: [-1,-1,-1,-1]

Explanation:

Each value in nums is unique, so no index shares the same value as the queried element. This results in -1 for all queries.


 
Constraints:


	1 <= queries.length <= nums.length <= 105
	1 <= nums[i] <= 106
	0 <= queries[i] < nums.length

## 🧪 Examples
Example 1:
- Input: [1,3,1,4,1,3,2]
- Output: [0,3,5]

Example 2:
- Input: [1,2,3,4]
- Output: [0,1,2,3]

## 🧠 Approach
- The problem is solved using a HashMap to store the indices of each element in the input array.
- The binary search function is used to find the position of the current index in the list of indices for the current element.
- The minimum distance is calculated by finding the minimum of the absolute difference between the next index and the current index, and the absolute difference between the previous index and the current index.
- The minimum distance is also updated to be the minimum of the minimum distance and the difference between the total length of the array and the absolute difference between the next index and the current index, and the difference between the total length of the array and the absolute difference between the previous index and the current index.

## ⏱️ Complexity
- Time: O(n + q log n), where n is the length of the input array and q is the number of queries.
- Space: O(n), where n is the length of the input array.

## 📊 Stats
- Runtime: 114 ms
- Memory: 173.66 MB
