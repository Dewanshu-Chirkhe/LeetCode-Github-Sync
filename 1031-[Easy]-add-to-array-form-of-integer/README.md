# Add to Array-Form of Integer

🔗 https://leetcode.com/problems/add-to-array-form-of-integer/

## 📘 Problem
The array-form of an integer num is an array representing its digits in left to right order.

	For example, for num = 1321, the array form is [1,3,2,1].

Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

## 🧪 Examples
```
Example 1:
  Input:  num = [1,2,0,0], k = 34
  Output: [1,2,3,4]
  Explanation: 1200 + 34 = 1234

Example 2:
  Input:  num = [2,7,4], k = 181
  Output: [4,5,5]
  Explanation: 274 + 181 = 455

Example 3:
  Input:  num = [2,1,5], k = 806
  Output: [1,0,2,1]
  Explanation: 215 + 806 = 1021
```

## 📐 Constraints
```
1 <= num.length <= 104
	0 <= num[i] <= 9
	num does not contain any leading zeros except for the zero itself.
	1 <= k <= 104
```

## 🧠 Approach
- The solution uses a while loop to iterate through the array and the integer k.
- It keeps track of the carry from the previous addition.
- In each iteration, it calculates the sum of the current digit from the array (if available), the current digit from k (if available), and the carry.
- The sum is then added to the result list, and the carry is updated for the next iteration.

## ⏱️ Complexity
- Time: O(max(n, log(k))), where n is the length of the array and log(k) is the number of digits in k.
- Space: O(n + log(k)), where n is the length of the array and log(k) is the number of digits in k.

## 📊 Stats
- Runtime: 3 ms
- Memory: 45.62 MB
