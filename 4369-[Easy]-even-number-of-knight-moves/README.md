# Even Number of Knight Moves

🔗 https://leetcode.com/problems/even-number-of-knight-moves/

## 📘 Problem
You are given two integer arrays start and target, where each array is of the form [x, y] representing a cell on a standard 8 x 8 chessboard.

Return true if a knight can move from start to target in an even number of moves. Otherwise, return false.

Note: A valid knight move consists of moving two squares in one direction and one square perpendicular to it. The figure below illustrates all eight possible moves from a cell.

## 🧪 Examples
```
Example 1:
  Input:  start = [1,1], target = [2,2]
  Output: true
  Explanation: One possible sequence of moves is (1, 1) -> (3, 2) -> (2, 4) -> (4, 3) -> (2, 2).

The knight reaches the target in 4 moves, which is even. Thus, the answer is true.

Example 2:
  Input:  start = [4,5], target = [6,6]
  Output: false
  Explanation: ​​​​​​​

It is impossible to reach target = [6, 6] from start = [4, 5] in an even number of moves. Thus, the answer is false.
```

## 📐 Constraints
```
start.length == target.length == 2
	0 <= start[i], target[i] <= 7
```

## 🧠 Approach
- The problem is about determining if a knight can move from a given start position to a target position on a chessboard.
- The knight's movement is restricted to L-shapes (two squares in one direction, then one square to the side).
- The solution calculates the Manhattan distance (sum of horizontal and vertical distances) between the start and target positions.
- It then checks if this distance is even, which is a necessary condition for the knight to reach the target position in an even number of moves.

## ⏱️ Complexity
- Time: O(1)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 41.91 MB
