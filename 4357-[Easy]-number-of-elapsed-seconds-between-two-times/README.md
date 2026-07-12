# Number of Elapsed Seconds Between Two Times

🔗 https://leetcode.com/problems/number-of-elapsed-seconds-between-two-times/

## 📘 Problem
You are given two valid times startTime and endTime, each represented as a string in the format &quot;HH:MM:SS&quot;.

Return the number of seconds that have elapsed from startTime to endTime, inclusive of both endpoints.

## 🧪 Examples
```
Example 1:
  Input:  startTime = &quot;01:00:00&quot;, endTime = &quot;01:00:25&quot;
  Output: 25
  Explanation: endTime is 25 seconds ahead of startTime.

Example 2:
  Input:  startTime = &quot;12:34:56&quot;, endTime = &quot;13:00:00&quot;
  Output: 1504
  Explanation: endTime is 25 minutes and 4 seconds ahead of startTime, which equals 1504 seconds.
```

## 📐 Constraints
```
startTime.length == 8
	endTime.length == 8
	startTime and endTime are valid times in the format &quot;HH:MM:SS&quot;
	00 <= HH <= 23
	00 <= MM <= 59
	00 <= SS <= 59
	endTime is not earlier than startTime
```

## 🧠 Approach
- Split the input strings into hours, minutes, and seconds using the split method.
- Calculate the difference in hours, minutes, and seconds between the two times.
- Convert the hour difference into seconds by multiplying it by 60 * 60.
- Add the minute and second differences to the hour difference to get the total elapsed seconds.

## ⏱️ Complexity
- Time: O(1)
- Space: O(1)

## 📊 Stats
- Runtime: 3 ms
- Memory: 42.42 MB
