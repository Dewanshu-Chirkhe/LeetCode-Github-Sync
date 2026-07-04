# Unique Middle Element

🔗 https://leetcode.com/problems/unique-middle-element/

## 📘 Problem
You are given an integer array nums of odd length n.

Return true if the middle element of nums appears exactly once in the array. Otherwise return false.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,2,3]
  Output: true
  Explanation: The middle element of nums is 2, which appears exactly once.

Thus, the answer is true.

Example 2:
  Input:  nums = [1,2,2]
  Output: false
  Explanation: The middle element of nums is 2, which appears twice.

Thus, the answer is false.
```

## 📐 Constraints
```
1 <= n == nums.length <= 100
	n is odd.
	1 <= nums[i] <= 100
```

## 🧠 Approach
- The solution checks if the middle element of the array is unique by iterating through the array and comparing each element with the middle element.
- If the middle element is found at any index other than the middle index, the function returns false, indicating that the middle element is not unique.
- If the function completes the iteration without finding the middle element at any other index, it returns true, indicating that the middle element is unique.
- The solution handles the edge case where the array has only one element by returning true, as there is no middle element in this case.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.23 MB
