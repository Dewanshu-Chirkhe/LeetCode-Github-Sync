# Minimum Element After Replacement With Digit Sum

🔗 https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

## 📘 Problem
You are given an integer array nums.

You replace each element in nums with the sum of its digits.

Return the minimum element in nums after all replacements.

## 🧪 Examples
```
Example 1:
  Input:  nums = [10,12,13,14]
  Output: 1
  Explanation: nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.

Example 2:
  Input:  nums = [1,2,3,4]
  Output: 1
  Explanation: nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.

Example 3:
  Input:  nums = [999,19,199]
  Output: 10
  Explanation: nums becomes [27, 10, 19] after all replacements, with minimum element 10.
```

## 📐 Constraints
```
1 <= nums.length <= 100
	1 <= nums[i] <= 104
```

## 🧠 Approach
- The solution iterates through each element in the input array `nums`.
- For each element, it calculates the digit sum by repeatedly taking the remainder of the element when divided by 10 (i.e., the last digit) and adding it to the sum, then dividing the element by 10 to remove the last digit.
- The minimum digit sum found so far is updated at each iteration.
- The function returns the minimum digit sum found.

## ⏱️ Complexity
- Time: O(n*m), where n is the number of elements in the array and m is the maximum number of digits in an element.
- Space: O(1), excluding the space required for the input array.

## 📊 Stats
- Runtime: 1 ms
- Memory: 42.58 MB
