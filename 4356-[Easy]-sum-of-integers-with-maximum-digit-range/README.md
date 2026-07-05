# Sum of Integers with Maximum Digit Range

🔗 https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/

## 📘 Problem
You are given an integer array nums.

The digit range of an integer is defined as the difference between its largest digit and smallest digit.

For example, the digit range of 5724 is 7 - 2 = 5.

Return the sum of all integers in nums whose digit range is equal to the maximum digit range among all integers in the array.

## 🧪 Examples
```
Example 1:
  Input:  nums = [5724,111,350]
  Output: 6074
  Explanation: i
			nums[i]
			Largest
			Smallest
			Digit Range
		
		
			0
			5724
			7
			2
			5
		
		
			1
			111
			1
			1
			0
		
		
			2
			350
			5
			0
			5
		
	

The maximum digit range is 5. The integers with this digit range are 5724 and 350, so the answer is 5724 + 350 = 6074.

Example 2:
  Input:  nums = [90,900]
  Output: 990
  Explanation: i
			nums[i]
			Largest
			Smallest
			Digit Range
		
		
			0
			90
			9
			0
			9
		
		
			1
			900
			9
			0
			9
		
	

The maximum digit range is 9. Both integers have this digit range, so the answer is 90 + 900 = 990.
```

## 📐 Constraints
```
1 <= nums.length <= 100
	10 <= nums[i] <= 105
```

## 🧠 Approach
- The problem requires finding the sum of integers in an array where the maximum digit range is achieved.
- The `getRange` function is used to find the smallest and largest digits in a given integer.
- The `maxDigitRange` function iterates through the array, calculates the digit range for each integer, and updates the maximum range and the corresponding sum.
- If a new maximum range is found, the current sum is updated to the current integer; otherwise, the current integer is added to the sum.

## ⏱️ Complexity
- Time: O(n * k), where n is the number of integers in the array and k is the maximum number of digits in an integer.
- Space: O(1), excluding the space required for the input and output arrays.

## 📊 Stats
- Runtime: 1 ms
- Memory: 43.43 MB
