# Delete the Middle Node of a Linked List

🔗 https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

## 📘 Problem
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the &lfloor;n / 2&rfloor;th node from the start using 0-based indexing, where &lfloor;x&rfloor; denotes the largest integer less than or equal to x.

	For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

## 🧪 Examples
```
Example 1:
  Input:  head = [1,3,4,7,1,2,6]
  Output: [1,3,4,1,2,6]
  Explanation: The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.

Example 2:
  Input:  head = [1,2,3,4]
  Output: [1,2,4]
  Explanation: The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.

Example 3:
  Input:  head = [2,1]
  Output: [2]
  Explanation: The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.
```

## 📐 Constraints
```
The number of nodes in the list is in the range [1, 105].
	1 <= Node.val <= 105
```

## 🧠 Approach
- The problem requires deleting the middle node of a linked list.
- To solve this, we first need to find the length of the linked list.
- Then, we need to find the node before the middle node and update its next pointer to skip the middle node.
- We handle edge cases where the linked list has 1 or 2 nodes.

## ⏱️ Complexity
- Time: O(n), where n is the number of nodes in the linked list, because we need to traverse the linked list to find its length and the middle node.
- Space: O(1), because we only use a constant amount of space to store the length and the temporary node.

## 📊 Stats
- Runtime: 4 ms
- Memory: 192.75 MB
