# Flipping an Image

🔗 https://leetcode.com/problems/flipping-an-image/

## 📘 Problem
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.


	For example, flipping [1,1,0] horizontally results in [0,1,1].


To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.


	For example, inverting [0,1,1] results in [1,0,0].


 
Example 1:


Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


Example 2:


Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


 
Constraints:


	n == image.length
	n == image[i].length
	1 <= n <= 20
	images[i][j] is either 0 or 1.

## 🧪 Examples
Example 1:
- Input: [[1,1,0],[1,0,1],[0,0,0]]
- Output: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]

## 🧠 Approach
- The given solution iterates over each element in the input image, flipping it by accessing the corresponding element from the right side of the image.
- It then inverts the flipped element by changing its value from 1 to 0 and vice versa.
- The solution uses a new 2D array to store the flipped and inverted image.
- The time complexity is O(n^2) where n is the number of rows (or columns) in the image, as it needs to iterate over each element in the image.

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(n^2)

## 📊 Stats
- Runtime: 1 ms
- Memory: 43.98 MB
