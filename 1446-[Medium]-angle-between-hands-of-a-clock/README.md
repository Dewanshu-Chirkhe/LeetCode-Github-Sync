# Angle Between Hands of a Clock

🔗 https://leetcode.com/problems/angle-between-hands-of-a-clock/

## 📘 Problem
Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within 10-5 of the actual value will be accepted as correct.

## 🧪 Examples
```
Example 1:
  Input:  hour = 12, minutes = 30
  Output: 165

Example 2:
  Input:  hour = 3, minutes = 30
  Output: 75

Example 3:
  Input:  hour = 3, minutes = 15
  Output: 7.5
```

## 📐 Constraints
```
1 <= hour <= 12
	0 <= minutes <= 59
```

## 🧠 Approach
- Calculate the angle of the minute hand by multiplying the number of minutes by 6, as each minute represents 6 degrees on the clock.
- Calculate the angle of the hour hand by multiplying the hour (adjusted to 12-hour format) by 30, and then adding half of the minutes, as each hour represents 30 degrees and each minute represents 0.5 degrees.
- Find the absolute difference between the angles of the hour and minute hands.
- Return the minimum of the difference and 360 minus the difference, to ensure the angle is always between 0 and 180 degrees.

## ⏱️ Complexity
- Time: O(1)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 42.69 MB
