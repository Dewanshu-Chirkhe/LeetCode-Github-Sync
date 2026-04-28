# Minimum Operations to Make a Uni-Value Grid

🔗 https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/

## 📘 Problem
You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

A uni-value grid is a grid where all the elements of it are equal.

Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[2,4],[6,8]], x = 2
  Output: 4
  Explanation: We can make every element equal to 4 by doing the following: 
- Add x to 2 once.
- Subtract x from 6 once.
- Subtract x from 8 twice.
A total of 4 operations were used.

Example 2:
  Input:  grid = [[1,5],[2,3]], x = 1
  Output: 5
  Explanation: We can make every element equal to 3.

Example 3:
  Input:  grid = [[1,2],[3,4]], x = 2
  Output: -1
  Explanation: It is impossible to make every element equal.
```

## 📐 Constraints
```
m == grid.length
	n == grid[i].length
	1 <= m, n <= 105
	1 <= m * n <= 105
	1 <= x, grid[i][j] <= 104
```

## 🧠 Approach
- The solution first checks if all elements in the grid can be made equal by performing operations. It does this by checking if the difference between each element and the first element is divisible by the given number `x`.
- If all elements can be made equal, it calculates the median of the grid.
- Then, it calculates the minimum number of operations required to make all elements equal to the median by dividing the absolute difference between each element and the median by `x`.
- The solution returns the total number of operations.

## ⏱️ Complexity
- Time: O(n*m*log(n*m)) where n and m are the number of rows and columns in the grid. This is because the solution first adds all elements to a list, then sorts the list.
- Space: O(n*m) to store all elements in the list.

## 📊 Stats
- Runtime: 102 ms
- Memory: 112.32 MB
