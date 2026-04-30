# Maximum Path Score in a Grid

🔗 https://leetcode.com/problems/maximum-path-score-in-a-grid/

## 📘 Problem
You are given an m x n grid where each cell contains one of the values 0, 1, or 2. You are also given an integer k.

You start from the top-left corner (0, 0) and want to reach the bottom-right corner (m - 1, n - 1) by moving only right or down.

Each cell contributes a specific score and incurs an associated cost, according to their cell values:

	0: adds 0 to your score and costs 0.
	1: adds 1 to your score and costs 1.
	2: adds 2 to your score and costs 1. ​​​​​​​

Return the maximum score achievable without exceeding a total cost of k, or -1 if no valid path exists.

Note: If you reach the last cell but the total cost exceeds k, the path is invalid.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[0, 1],[2, 0]], k = 1
  Output: 2
  Explanation: ​​​​​​​

Example 2:
  Input:  grid = [[0, 1],[1, 2]], k = 1
  Output: -1
  Explanation: There is no path that reaches cell (1, 1)​​​​​​​ without exceeding cost k. Thus, the answer is -1.
```

## 📐 Constraints
```
1 <= m, n <= 200
	0 <= k <= 103​​​​​​​
	​​​​​​​grid[0][0] == 0
	0 <= grid[i][j] <= 2
```

## 🧠 Approach
- The problem is solved using dynamic programming with memoization.
- The `helper` function is a recursive function that calculates the maximum path score from the current cell to the bottom-right cell.
- The function takes four parameters: the current row `i`, the current column `j`, the remaining cost `cost`, and the grid `grid`.
- The function uses a 3D array `dp` to store the maximum path score for each cell and each possible cost.

## ⏱️ Complexity
- Time: O(m*n*k), where m and n are the dimensions of the grid and k is the maximum cost.
- Space: O(m*n*k), where m and n are the dimensions of the grid and k is the maximum cost.

## 📊 Stats
- Runtime: 354 ms
- Memory: 257.49 MB
