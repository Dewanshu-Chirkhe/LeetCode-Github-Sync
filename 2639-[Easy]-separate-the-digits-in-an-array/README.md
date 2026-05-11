# Separate the Digits in an Array

🔗 https://leetcode.com/problems/separate-the-digits-in-an-array/

## 📘 Problem
Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.

To separate the digits of an integer is to get all the digits it has in the same order.

	For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].

## 🧪 Examples
```
Example 1:
  Input:  nums = [13,25,83,77]
  Output: [1,3,2,5,8,3,7,7]
  Explanation: - The separation of 13 is [1,3].
- The separation of 25 is [2,5].
- The separation of 83 is [8,3].
- The separation of 77 is [7,7].
answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.

Example 2:
  Input:  nums = [7,1,3,9]
  Output: [7,1,3,9]
  Explanation: The separation of each integer in nums is itself.
answer = [7,1,3,9].
```

## 📐 Constraints
```
1 <= nums.length <= 1000
	1 <= nums[i] <= 105
```

## 🧠 Approach
- The solution uses a List to store the separated digits.
- It iterates over each element in the input array. If the element is a multi-digit number, it uses a Stack to separate the digits.
- The separated digits are then added to the List.
- Finally, the List is converted to an array and returned.

## ⏱️ Complexity
- Time: O(N * M), where N is the number of elements in the input array and M is the maximum number of digits in a multi-digit number.
- Space: O(N + M), where N is the number of elements in the input array and M is the maximum number of digits in a multi-digit number.

## 📊 Stats
- Runtime: 9 ms
- Memory: 44.11 MB
