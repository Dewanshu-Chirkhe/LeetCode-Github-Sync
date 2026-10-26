# Rising Temperature

🔗 https://leetcode.com/problems/rising-temperature/

## 📘 Problem
Table: Weather

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id is the column with unique values for this table.
There are no different rows with the same recordDate.
This table contains information about the temperature on a certain day.

 

Write a solution to find all dates&#39; id with higher temperatures compared to its previous dates (yesterday).

Return the result table in any order.

The result format is in the following example.

## 🧪 Examples
```
Example 1:
  Input:  Weather table:
  Output: +----+
  Explanation: In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
In 2015-01-04, the temperature was higher than the previous day (20 -> 30).
```

## 📐 Constraints
Not available

## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)

## 📊 Stats
- Runtime: 636 ms
- Memory: 0.0 MB
