# Sum of Distances

🔗 https://leetcode.com/problems/sum-of-distances/

## 📘 Problem
You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.

Return the array arr.

 
Example 1:


Input: nums = [1,3,1,1,2]
Output: [5,0,3,4,0]
Explanation: 
When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
When i = 1, arr[1] = 0 because there is no other index with value 3.
When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. 
When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. 
When i = 4, arr[4] = 0 because there is no other index with value 2. 



Example 2:


Input: nums = [0,5,3]
Output: [0,0,0]
Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.


 
Constraints:


	1 <= nums.length <= 105
	0 <= nums[i] <= 109


 
Note: This question is the same as  2121: Intervals Between Identical Elements.

## 🧪 Examples
Example 1:
- Input: [1,3,1,1,2]
- Output: [0,5,3]

## 🧠 Approach
- The problem is solved by first creating a map where the keys are the unique numbers in the input array and the values are lists of indices where each number appears.
- Then, for each list of indices, a prefix sum array is calculated to efficiently compute the sum of distances from each index to all other indices.
- The sum of distances for each number is calculated by considering the left and right parts of the list separately and using the prefix sum array to avoid redundant calculations.
- Finally, the sum of distances for each number is stored in the result array.

## ⏱️ Complexity
- Time: O(n^2) where n is the number of unique numbers in the input array, because for each number, we are iterating over its list of indices to calculate the sum of distances.
- Space: O(n) where n is the number of unique numbers in the input array, because we are storing the map and the result array.

## 📊 Stats
- Runtime: 23 ms
- Memory: 111.95 MB
