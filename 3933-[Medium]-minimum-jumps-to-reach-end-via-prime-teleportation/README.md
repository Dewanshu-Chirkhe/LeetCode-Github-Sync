# Minimum Jumps to Reach End via Prime Teleportation

🔗 https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-teleportation/

## 📘 Problem
You are given an integer array nums of length n.

You start at index 0, and your goal is to reach index n - 1.

From any index i, you may perform one of the following operations:

	Adjacent Step: Jump to index i + 1 or i - 1, if the index is within bounds.
	Prime Teleportation: If nums[i] is a prime number p, you may instantly jump to any index j != i such that nums[j] % p == 0.

Return the minimum number of jumps required to reach index n - 1.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,2,4,6]
  Output: 2
  Explanation: One optimal sequence of jumps is:

	Start at index i = 0. Take an adjacent step to index 1.
	At index i = 1, nums[1] = 2 is a prime number. Therefore, we teleport to index i = 3 as nums[3] = 6 is divisible by 2.

Thus, the answer is 2.

Example 2:
  Input:  nums = [2,3,4,7,9]
  Output: 2
  Explanation: One optimal sequence of jumps is:

	Start at index i = 0. Take an adjacent step to index i = 1.
	At index i = 1, nums[1] = 3 is a prime number. Therefore, we teleport to index i = 4 since nums[4] = 9 is divisible by 3.

Thus, the answer is 2.

Example 3:
  Input:  nums = [4,6,5,8]
  Output: 3
  Explanation: Since no teleportation is possible, we move through 0 &rarr; 1 &rarr; 2 &rarr; 3. Thus, the answer is 3.
```

## 📐 Constraints
```
1 <= n == nums.length <= 105
	1 <= nums[i] <= 106
```

## 🧠 Approach
- The problem is solved using a combination of a map to store the indices of each number and a BFS (Breadth-First Search) algorithm to find the minimum number of jumps.
- The map is used to store the indices of each number and also to find the maximum number in the array.
- The BFS algorithm is used to traverse the array and find the minimum number of jumps.
- Prime teleportation is used to jump to a new position by multiplying the current number by a prime number.

## ⏱️ Complexity
- Time: O(n log log n + n * m) where n is the length of the array and m is the maximum number in the array.
- Space: O(n + m) for the map and the distance array.

## 📊 Stats
- Runtime: 261 ms
- Memory: 211.73 MB
