# Shift 2D Grid

🔗 https://leetcode.com/problems/shift-2d-grid/

## 📘 Problem
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

	Element at grid[i][j] moves to grid[i][j + 1].
	Element at grid[i][n - 1] moves to grid[i + 1][0].
	Element at grid[m - 1][n - 1] moves to grid[0][0].

Return the 2D grid after applying shift operation k times.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
  Output: [[9,1,2],[3,4,5],[6,7,8]]

Example 2:
  Input:  grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
  Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

Example 3:
  Input:  grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
  Output: [[1,2,3],[4,5,6],[7,8,9]]
```

## 📐 Constraints
```
m == grid.length
	n == grid[i].length
	1 <= m <= 50
	1 <= n <= 50
	-1000 <= grid[i][j] <= 1000
	0 <= k <= 100
```

## 🧠 Approach
- The given solution uses a while loop to shift the grid k times.
- In each iteration, it creates a temporary grid to store the shifted elements.
- The elements are shifted by moving the last column to the first column of the next row.
- The process is repeated until the grid is shifted k times.

## ⏱️ Complexity
- Time: O(m * n * k), where m is the number of rows and n is the number of columns in the grid.
- Space: O(m * n), for the temporary grid and the result list.

## 📊 Stats
- Runtime: 12 ms
- Memory: 45.23 MB
