# Binary Tree Level Order Traversal

🔗 https://leetcode.com/problems/binary-tree-level-order-traversal/

## 📘 Problem
Given the root of a binary tree, return the level order traversal of its nodes&#39; values. (i.e., from left to right, level by level).

## 🧪 Examples
```
Example 1:
  Input:  root = [3,9,20,null,null,15,7]
  Output: [[3],[9,20],[15,7]]

Example 2:
  Input:  root = [1]
  Output: [[1]]

Example 3:
  Input:  root = []
  Output: []
```

## 📐 Constraints
```
The number of nodes in the tree is in the range [0, 2000].
	-1000 <= Node.val <= 1000
```

## 🧠 Approach
- The problem is solved using a Breadth-First Search (BFS) approach, which is suitable for level order traversal of a binary tree.
- The height of the binary tree is calculated using a recursive function `height(root)`.
- The `bfs(root, level, ans)` function is used to traverse the binary tree level by level and store the node values in the `ans` list.
- The `levelOrder(root)` function initializes the `ans` list with the correct number of levels and calls the `bfs` function to populate the list.

## ⏱️ Complexity
- Time: O(n), where n is the number of nodes in the binary tree, since each node is visited once.
- Space: O(n), where n is the number of nodes in the binary tree, since in the worst case, the binary tree is a linked list and the space complexity is O(n).

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.76 MB
