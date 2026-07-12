# Rank Transform of an Array

🔗 https://leetcode.com/problems/rank-transform-of-an-array/

## 📘 Problem
Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

	Rank is an integer starting from 1.
	The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
	Rank should be as small as possible.

## 🧪 Examples
```
Example 1:
  Input:  arr = [40,10,20,30]
  Output: [4,1,2,3]
  Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:
  Input:  arr = [100,100,100]
  Output: [1,1,1]
  Explanation: Same elements share the same rank.

Example 3:
  Input:  arr = [37,12,28,9,100,56,80,5,12]
  Output: [5,3,4,2,8,6,7,1,3]
```

## 📐 Constraints
```
0 <= arr.length <= 105
	-109 <= arr[i] <= 109
```

## 🧠 Approach
- Create a temporary copy of the input array and sort it in ascending order.
- Create a HashMap to store the rank of each unique element in the sorted array.
- Iterate through the sorted array and assign a rank to each unique element in the HashMap.
- Create a new array to store the rank of each element in the original array and use the HashMap to get the rank of each element.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation.
- Space: O(n) for the temporary array, HashMap, and the output array.

## 📊 Stats
- Runtime: 34 ms
- Memory: 71.79 MB
