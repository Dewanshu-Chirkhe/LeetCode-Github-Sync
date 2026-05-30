# Increasing Order Search Tree

🔗 https://leetcode.com/problems/increasing-order-search-tree/

## 📘 Problem
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

## 🧪 Examples
```
Example 1:
  Input:  root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
  Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

Example 2:
  Input:  root = [5,1,7]
  Output: [1,null,5,null,7]
```

## 📐 Constraints
```
The number of nodes in the given tree will be in the range [1, 100].
	0 <= Node.val <= 1000
```

## 🧠 Approach
- The problem requires transforming a binary tree into an increasing order search tree.
- The solution uses an in-order traversal to store the node values in a list.
- The list is then used to construct the new increasing order search tree.
- The new tree is constructed by iterating over the list and creating new nodes, linking them together in the correct order.

## ⏱️ Complexity
- Time: O(N), where N is the number of nodes in the tree, as each node is visited once.
- Space: O(N), as in the worst case, the list will store all node values.

## 📊 Stats
- Runtime: 0 ms
- Memory: 40.82 MB
