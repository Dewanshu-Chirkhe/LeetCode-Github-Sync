# Rotate List

🔗 https://leetcode.com/problems/rotate-list/

## 📘 Problem
Given the head of a linked list, rotate the list to the right by k places.

## 🧪 Examples
```
Example 1:
  Input:  head = [1,2,3,4,5], k = 2
  Output: [4,5,1,2,3]

Example 2:
  Input:  head = [0,1,2], k = 4
  Output: [2,0,1]
```

## 📐 Constraints
```
The number of nodes in the list is in the range [0, 500].
	-100 <= Node.val <= 100
	0 <= k <= 2 * 109
```

## 🧠 Approach
- The problem is solved by first finding the length of the linked list.
- Then, we calculate the new tail node by rotating the list to the right by k positions.
- We use two pointers, slow and fast, to find the new tail node.
- Finally, we update the next pointers of the new tail node and the new head node.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 42.4 MB
