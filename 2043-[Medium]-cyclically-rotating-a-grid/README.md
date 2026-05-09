# Cyclically Rotating a Grid

🔗 https://leetcode.com/problems/cyclically-rotating-a-grid/

## 📘 Problem
You are given an m x n integer matrix grid​​​, where m and n are both even integers, and an integer k.

The matrix is composed of several layers, which is shown in the below image, where each color is its own layer:



A cyclic rotation of the matrix is done by cyclically rotating each layer in the matrix. To cyclically rotate a layer once, each element in the layer will take the place of the adjacent element in the counter-clockwise direction. An example rotation is shown below:

Return the matrix after applying k cyclic rotations to it.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[40,10],[30,20]], k = 1
  Output: [[10,20],[40,30]]
  Explanation: The figures above represent the grid at every state.

Example 2:
  Input:  grid = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], k = 2
  Output: [[3,4,8,12],[2,11,10,16],[1,7,6,15],[5,9,13,14]]
  Explanation: The figures above represent the grid at every state.
```

## 📐 Constraints
```
m == grid.length
	n == grid[i].length
	2 <= m, n <= 50
	Both m and n are even integers.
	1 <= grid[i][j] <= 5000
	1 <= k <= 109
```

## 🧠 Approach
- The problem is solved by rotating the grid in a cyclic manner, which involves rotating each layer of the grid by a certain number of positions.
- The grid is divided into layers, with each layer being a square of elements.
- The `rotate` method is used to rotate a single layer of the grid, and it takes the grid, the number of positions to rotate, and the top-left and bottom-right coordinates of the layer as parameters.
- The `rotateGrid` method is used to rotate the entire grid, and it takes the grid and the number of positions to rotate as parameters.

## ⏱️ Complexity
- Time: O(m*n), where m is the number of rows and n is the number of columns in the grid.
- Space: O(m*n), as the `list` variable stores all the elements of the current layer in the grid.

## 📊 Stats
- Runtime: 2 ms
- Memory: 44.96 MB
