# Count Dominant Nodes in a Binary Tree

🔗 https://leetcode.com/problems/count-dominant-nodes-in-a-binary-tree/

## 📘 Problem
You are given the root of a complete binary tree.

A node x is called dominant if its value is equal to the maximum value among all nodes in the subtree rooted at x.

Return the number of dominant nodes in the tree.

## 🧪 Examples
```
Example 1:
  Input:  root = [5,3,8,2,4,7,1]
  Output: 5
  Explanation: The leaf nodes with values 2, 4, 7, and 1 are dominant.
	The node with value 8 is dominant because its value is the maximum value in its subtree [8, 7, 1].
	Thus, the answer is 5.

Example 2:
  Input:  root = [1,2,3,1,2]
  Output: 4
  Explanation: The leaf nodes with values 1, 2, and 3 are dominant.
	The node with value 2 whose subtree is [2, 1, 2] is dominant because its value is the maximum value in its subtree.
	Thus, the answer is 4.
```

## 📐 Constraints
```
The number of nodes in the tree is in the range [1, 105].
	1 <= Node.val <= 109
	The tree is guaranteed to be a complete binary tree.
```

## 🧠 Approach
- The problem is solved using a recursive approach to traverse the binary tree.
- The function `count` is used to find the maximum value in the left and right subtrees, and the maximum value of the current node.
- If the current node's value is equal to the maximum value of its subtree, it increments the `ans` variable.
- The function `countDominantNodes` initializes `ans` to 0 and calls the `count` function to start the recursion.

## ⏱️ Complexity
- Time: O(N), where N is the number of nodes in the binary tree, as each node is visited once.
- Space: O(H), where H is the height of the binary tree, due to the recursive call stack. In the worst case, the tree is skewed and H = N.

## 📊 Stats
- Runtime: 6 ms
- Memory: 165.2 MB
