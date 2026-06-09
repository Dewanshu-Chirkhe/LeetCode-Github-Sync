# Maximum Total Subarray Value I

🔗 https://leetcode.com/problems/maximum-total-subarray-value-i/

## 📘 Problem
You are given an integer array nums of length n and an integer k.

You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and the exact same subarray (same l and r) can be chosen more than once.

The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).

The total value is the sum of the values of all chosen subarrays.

Return the maximum possible total value you can achieve.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,3,2], k = 2
  Output: 4
  Explanation: One optimal approach is:

	Choose nums[0..1] = [1, 3]. The maximum is 3 and the minimum is 1, giving a value of 3 - 1 = 2.
	Choose nums[0..2] = [1, 3, 2]. The maximum is still 3 and the minimum is still 1, so the value is also 3 - 1 = 2.

Adding these gives 2 + 2 = 4.

Example 2:
  Input:  nums = [4,2,5,1], k = 3
  Output: 12
  Explanation: One optimal approach is:

	Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, giving a value of 5 - 1 = 4.
	Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, so the value is also 4.
	Choose nums[2..3] = [5, 1]. The maximum is 5 and the minimum is 1, so the value is again 4.

Adding these gives 4 + 4 + 4 = 12.
```

## 📐 Constraints
```
1 <= n == nums.length <= 5 * 10​​​​​​​4
	0 <= nums[i] <= 109
	1 <= k <= 105
```

## 🧠 Approach
- The solution uses a simple and efficient approach to find the maximum total subarray value.
- It iterates through the array to find the minimum and maximum values.
- The maximum total subarray value is then calculated by subtracting the minimum value from the maximum value and multiplying by the number of subarrays (k).
- This approach assumes that the subarrays are non-overlapping and have equal sizes.

## ⏱️ Complexity
- Time: O(n), where n is the number of elements in the array.
- Space: O(1), as it only uses a constant amount of space to store the minimum and maximum values.

## 📊 Stats
- Runtime: 1 ms
- Memory: 59.49 MB
