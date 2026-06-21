# Valid Subarrays With Matching Sum Digits I

🔗 https://leetcode.com/problems/valid-subarrays-with-matching-sum-digits-i/

## 📘 Problem
You are given an integer array nums and an integer digit x.

A subarray nums[l..r] is considered valid if the sum of its elements satisfies both of the following conditions:

	The first digit of the sum is equal to x.
	The last digit of the sum is equal to x.

Return the number of valid subarrays.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,100,1], x = 1
  Output: 4
  Explanation: The valid subarrays are:

	nums[0..0]: sum = 1
	nums[0..1]: sum = 1 + 100 = 101
	nums[1..2]: sum = 100 + 1 = 101
	nums[2..2]: sum = 1

Thus, the answer is 4.

Example 2:
  Input:  nums = [1], x = 2
  Output: 0
  Explanation: The only subarray is nums[0..0] with a sum of 1, which does not satisfy the conditions.

Thus, the answer is 0.
```

## 📐 Constraints
```
1 <= nums.length <= 1500
	1 <= nums[i] <= 109
	1 <= x <= 9
```

## 🧠 Approach
- The problem is solved by iterating over all possible subarrays of the given array and checking if the sum of each subarray matches the given number x.
- The `isMatching` function checks if the first and last digits of the sum match the given number x.
- The `countValidSubarrays` function uses two nested loops to generate all possible subarrays and checks each sum using the `isMatching` function.
- The count of valid subarrays is incremented whenever the sum matches the given number x.

## ⏱️ Complexity
- Time: O(n^2 * m), where n is the length of the array and m is the maximum possible sum of a subarray.
- Space: O(1), excluding the space required for the input array.

## 📊 Stats
- Runtime: 2133 ms
- Memory: 45.03 MB
