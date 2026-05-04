# Rotate Image

🔗 https://leetcode.com/problems/rotate-image/

## 📘 Problem
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

## 🧪 Examples
```
Example 1:
  Input:  matrix = [[1,2,3],[4,5,6],[7,8,9]]
  Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
  Input:  matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
  Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
```

## 📐 Constraints
```
n == matrix.length == matrix[i].length
	1 <= n <= 20
	-1000 <= matrix[i][j] <= 1000
```

## 🧠 Approach
- The given solution first transposes the matrix, swapping elements across the diagonal.
- Then, it reverses each row in the transposed matrix to achieve the final rotated result.
- This approach takes advantage of the symmetry of the matrix and the properties of transpose and reverse operations.
- The time complexity of this approach is O(n^2) due to the two nested loops, where n is the number of rows (or columns) in the matrix.

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 41.87 MB
