# Surface Area of 3D Shapes

🔗 https://leetcode.com/problems/surface-area-of-3d-shapes/

## 📘 Problem
You are given an n x n grid where you have placed some 1 x 1 x 1 cubes. Each value v = grid[i][j] represents a tower of v cubes placed on top of cell (i, j).

After placing these cubes, you have decided to glue any directly adjacent cubes to each other, forming several irregular 3D shapes.

Return the total surface area of the resulting shapes.

Note: The bottom face of each shape counts toward its surface area.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[1,2],[3,4]]
  Output: 34

Example 2:
  Input:  grid = [[1,1,1],[1,0,1],[1,1,1]]
  Output: 32

Example 3:
  Input:  grid = [[2,2,2],[2,1,2],[2,2,2]]
  Output: 46
```

## 📐 Constraints
```
n == grid.length == grid[i].length
	1 <= n <= 50
	0 <= grid[i][j] <= 50
```

## 🧠 Approach
- The problem is solved by iterating over each cell in the 3D grid and calculating the surface area contributed by each cell.
- For each cell with height greater than 0, the surface area is calculated as 4 times the height plus 2 (for the top and bottom faces).
- The surface area is then adjusted by subtracting the overlap with adjacent cells (if they exist) to avoid double counting.
- The total surface area is calculated by summing up the surface area of each cell.

## ⏱️ Complexity
- Time: O(m*n), where m and n are the dimensions of the grid.
- Space: O(1), as only a constant amount of space is used to store the variables.

## 📊 Stats
- Runtime: 3 ms
- Memory: 44.07 MB
