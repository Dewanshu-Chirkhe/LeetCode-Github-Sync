# Find Customer Referee

🔗 https://leetcode.com/problems/find-customer-referee/

## 📘 Problem
Table: Customer

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

 

Find the names of the customer that are either:

	referred by any customer with id != 2.
	not referred by any customer.

Return the result table in any order.

The result format is in the following example.

## 🧪 Examples
```
Example 1:
  Input:  Customer table:
  Output: +------+
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
- Runtime: 904 ms
- Memory: 0.0 MB
