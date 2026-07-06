# Remove Covered Intervals

🔗 https://leetcode.com/problems/remove-covered-intervals/

## 📘 Problem
Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.

Return the number of remaining intervals.

## 🧪 Examples
```
Example 1:
  Input:  intervals = [[1,4],[3,6],[2,8]]
  Output: 2
  Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.

Example 2:
  Input:  intervals = [[1,4],[2,3]]
  Output: 1
```

## 📐 Constraints
```
1 <= intervals.length <= 1000
	intervals[i].length == 2
	0 <= li < ri <= 105
	All the given intervals are unique.
```

## 🧠 Approach
- Sort the intervals based on their start value and if two intervals have the same start value, sort them based on their end value in descending order.
- Initialize variables to keep track of the previous interval's start and end values, and the count of non-overlapping intervals.
- Iterate through the sorted intervals, and if the current interval overlaps with the previous one, skip it. Otherwise, increment the count of non-overlapping intervals and update the previous interval's start and end values.
- Return the count of non-overlapping intervals.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation, where n is the number of intervals.
- Space: O(1) excluding the space required for the output, as we only use a constant amount of space to store the variables.

## 📊 Stats
- Runtime: 7 ms
- Memory: 44.32 MB
