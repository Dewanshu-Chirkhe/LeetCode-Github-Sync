# Jump Game IV

🔗 https://leetcode.com/problems/jump-game-iv/

## 📘 Problem
Given an array of integers arr, you are initially positioned at the first index of the array.

In one step you can jump from index i to index:

	i + 1 where: i + 1 < arr.length.
	i - 1 where: i - 1 >= 0.
	j where: arr[i] == arr[j] and i != j.

Return the minimum number of steps to reach the last index of the array.

Notice that you can not jump outside of the array at any time.

## 🧪 Examples
```
Example 1:
  Input:  arr = [100,-23,-23,404,100,23,23,23,3,404]
  Output: 3
  Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.

Example 2:
  Input:  arr = [7]
  Output: 0
  Explanation: Start index is the last index. You do not need to jump.

Example 3:
  Input:  arr = [7,6,9,6,9,6,9,7]
  Output: 1
  Explanation: You can jump directly from index 0 to index 7 which is last index of the array.
```

## 📐 Constraints
```
1 <= arr.length <= 5 * 104
	-108 <= arr[i] <= 108
```

## 🧠 Approach
- The problem is solved using a Breadth-First Search (BFS) approach with the help of a queue and a map.
- The map is used to store the indices of elements with the same value, allowing us to jump to those indices in constant time.
- The queue is used to keep track of the indices to be visited, and the visited array is used to avoid visiting the same index multiple times.
- The algorithm iteratively explores the neighbors of the current index, updating the queue and visited array accordingly.

## ⏱️ Complexity
- Time: O(n + m), where n is the number of elements in the array and m is the number of unique elements in the array.
- Space: O(n + m), where n is the number of elements in the array and m is the number of unique elements in the array.

## 📊 Stats
- Runtime: 50 ms
- Memory: 70.89 MB
