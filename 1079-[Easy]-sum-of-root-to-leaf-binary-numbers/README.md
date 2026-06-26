# Sum of Root To Leaf Binary Numbers

🔗 https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

## 📘 Problem
You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.

	For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.

For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.

The test cases are generated so that the answer fits in a 32-bits integer.

## 🧪 Examples
```
Example 1:
  Input:  root = [1,0,1,0,1,0,1]
  Output: 22
  Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

Example 2:
  Input:  root = [0]
  Output: 0
```

## 📐 Constraints
```
The number of nodes in the tree is in the range [1, 1000].
	Node.val is 0 or 1.
```

## 🧠 Approach
- The problem is solved using Depth-First Search (DFS) to traverse the binary tree.
- The DFS function appends the current node's value to the current binary number string.
- When a leaf node is reached, the binary number string is added to the list.
- The sum of all binary numbers from root to leaf is calculated by parsing each binary number string to decimal and summing them up.

## ⏱️ Complexity
- Time: O(2^n), where n is the height of the binary tree, because in the worst case, we might have to visit all nodes in the tree.
- Space: O(n), where n is the number of leaf nodes in the binary tree, because in the worst case, we might have to store all leaf nodes in the list.

## 📊 Stats
- Runtime: 6 ms
- Memory: 42.24 MB
