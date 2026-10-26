# Big Countries

🔗 https://leetcode.com/problems/big-countries/

## 📘 Problem
Table: World

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | bigint  |
+-------------+---------+
name is the primary key (column with unique values) for this table.
Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.

 

A country is big if:

	it has an area of at least three million (i.e., 3000000 km2), or
	it has a population of at least twenty-five million (i.e., 25000000).

Write a solution to find the name, population, and area of the big countries.

Return the result table in any order.

The result format is in the following example.

## 🧪 Examples
```
Example 1:
  Input:  World table:
  Output: +-------------+------------+---------+
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
- Runtime: 410 ms
- Memory: 0.0 MB
