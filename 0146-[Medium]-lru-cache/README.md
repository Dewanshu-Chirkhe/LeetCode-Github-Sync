# LRU Cache

🔗 https://leetcode.com/problems/lru-cache/

## 📘 Problem
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

	LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
	int get(int key) Return the value of the key if the key exists, otherwise return -1.
	void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.

## 🧪 Examples
```
Example 1:
  Input:  
  Output: 
```

## 📐 Constraints
```
1 <= capacity <= 3000
	0 <= key <= 104
	0 <= value <= 105
	At most 2 * 105 calls will be made to get and put.
```

## 🧠 Approach
- The problem is solved using a doubly linked list to store the nodes in the order of most recently used to least recently used.
- Each node in the linked list represents a key-value pair in the cache.
- A HashMap is used to store the mapping between keys and their corresponding nodes in the linked list.
- The cache is implemented as a doubly linked list with a head and a tail node, where the head node points to the most recently used node and the tail node points to the least recently used node.

## ⏱️ Complexity
- Time: O(1) for get and put operations, except when the cache is full and a node needs to be removed, which takes O(1) time as well.
- Space: O(capacity) to store the nodes in the linked list and the mapping in the HashMap.

## 📊 Stats
- Runtime: 46 ms
- Memory: 127.96 MB
