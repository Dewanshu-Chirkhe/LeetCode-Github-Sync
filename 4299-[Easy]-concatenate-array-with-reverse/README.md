# Concatenate Array With Reverse

🔗 https://leetcode.com/problems/concatenate-array-with-reverse/

## 📘 Problem
You are given an integer array nums of length n.

Construct a new array ans of length 2 * n such that the first n elements are the same as nums, and the next n elements are the elements of nums in reverse order.

Formally, for 0 <= i <= n - 1:

	ans[i] = nums[i]
	ans[i + n] = nums[n - i - 1]

Return an integer array ans.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,2,3]
  Output: [1,2,3,3,2,1]
  Explanation: The first n elements of ans are the same as nums.

For the next n = 3 elements, each element is taken from nums in reverse order:

	ans[3] = nums[2] = 3
	ans[4] = nums[1] = 2
	ans[5] = nums[0] = 1

Thus, ans = [1, 2, 3, 3, 2, 1].

Example 2:
  Input:  nums = [1]
  Output: [1,1]
  Explanation: The array remains the same when reversed. Thus, ans = [1, 1].
```

## 📐 Constraints
```
1 <= nums.length <= 100
	1 <= nums[i] <= 100
```

## 🧠 Approach
- Create an array `ans` of size `2*n` to store the concatenated result.
- Copy the elements from `nums` to `ans` in the first half of the array.
- Copy the elements from `nums` in reverse order to the second half of the array.
- Return the `ans` array.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 1 ms
- Memory: 45.14 MB
