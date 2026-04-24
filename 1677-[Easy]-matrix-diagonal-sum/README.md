# Matrix Diagonal Sum

🔗 https://leetcode.com/problems/matrix-diagonal-sum/

## 📘 Problem
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 
Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.


Example 2:


Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8


Example 3:


Input: mat = [[5]]
Output: 5


 
Constraints:


	n == mat.length == mat[i].length
	1 <= n <= 100
	1 <= mat[i][j] <= 100

## 🧪 Examples
Example 1:
- Input: [[1,2,3],[4,5,6],[7,8,9]]
- Output: [[1,1,1,1],[1,1,1,1],[1,1,1,1],[1,1,1,1]]

## 🧠 Approach
- The solution iterates over each element in the matrix, checking if it's on the main diagonal (i == j) or the anti-diagonal (j+i+1 == n).
- If the element is on the main diagonal, it's added to the sum.
- If the element is on the anti-diagonal, it's also added to the sum.
- The solution assumes the input matrix is a square matrix (n x n).

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(1)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.19 MB
