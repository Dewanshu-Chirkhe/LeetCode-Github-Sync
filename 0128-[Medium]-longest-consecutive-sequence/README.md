# Longest Consecutive Sequence

🔗 https://leetcode.com/problems/longest-consecutive-sequence/

## 📘 Problem
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

## 🧪 Examples
```
Example 1:
  Input:  nums = [100,4,200,1,3,2]
  Output: 4
  Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
  Input:  nums = [0,3,7,2,5,8,4,6,0,1]
  Output: 9

Example 3:
  Input:  nums = [1,0,1,2]
  Output: 3
```

## 📐 Constraints
```
0 <= nums.length <= 105
	-109 <= nums[i] <= 109
```

## 🧠 Approach
- The given solution sorts the input array `nums` in ascending order.
- It then iterates through the sorted array, keeping track of the current sequence length `len` and the maximum sequence length `maxLen`.
- If the current element is one more than the previous element, it increments the sequence length `len`.
- If the current element is not one more than the previous element, it resets the sequence length `len` to 1.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation, where n is the number of elements in the input array.
- Space: O(1) excluding the space required for the input array, as the solution only uses a constant amount of space to store the maximum sequence length and the current sequence length.

## 📊 Stats
- Runtime: 21 ms
- Memory: 74.04 MB
