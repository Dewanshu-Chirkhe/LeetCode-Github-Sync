# Jump Game III

🔗 https://leetcode.com/problems/jump-game-iii/

## 📘 Problem
Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.

Notice that you can not jump outside of the array at any time.

## 🧪 Examples
```
Example 1:
  Input:  arr = [4,2,3,0,3,1,2], start = 5
  Output: true
  Explanation: All possible ways to reach at index 3 with value 0 are: 
index 5 -> index 4 -> index 1 -> index 3 
index 5 -> index 6 -> index 4 -> index 1 -> index 3

Example 2:
  Input:  arr = [4,2,3,0,3,1,2], start = 0
  Output: true
  Explanation: One possible way to reach at index 3 with value 0 is: 
index 0 -> index 4 -> index 1 -> index 3

Example 3:
  Input:  arr = [3,0,2,1,2], start = 2
  Output: false
  Explanation: There is no way to reach at index 1 with value 0.
```

## 📐 Constraints
```
1 <= arr.length <= 5 * 104
	0 <= arr[i] < arr.length
	0 <= start < arr.length
```

## 🧠 Approach
- The problem is solved using a depth-first search (DFS) approach with memoization to avoid revisiting the same indices.
- The `helper` function takes the current index and a boolean array to keep track of visited indices.
- It checks if the current index can reach a 0 by moving either `arr[curr]` steps forward or backward.
- If the current index can reach a 0, it returns true; otherwise, it returns false.

## ⏱️ Complexity
- Time: O(n), where n is the number of elements in the array, because each element is visited at most once.
- Space: O(n), where n is the number of elements in the array, because in the worst case, the boolean array `visited` will store a boolean value for each element in the array.

## 📊 Stats
- Runtime: 1 ms
- Memory: 49.74 MB
