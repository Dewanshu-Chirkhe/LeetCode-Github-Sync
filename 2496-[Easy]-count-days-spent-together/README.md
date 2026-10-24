# Count Days Spent Together

🔗 https://leetcode.com/problems/count-days-spent-together/

## 📘 Problem
Alice and Bob are traveling to Rome for separate business meetings.

You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob. Alice will be in the city from the dates arriveAlice to leaveAlice (inclusive), while Bob will be in the city from the dates arriveBob to leaveBob (inclusive). Each will be a 5-character string in the format &quot;MM-DD&quot;, corresponding to the month and day of the date.

Return the total number of days that Alice and Bob are in Rome together.

You can assume that all dates occur in the same calendar year, which is not a leap year. Note that the number of days per month can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].

## 🧪 Examples
```
Example 1:
  Input:  arriveAlice = &quot;08-15&quot;, leaveAlice = &quot;08-18&quot;, arriveBob = &quot;08-16&quot;, leaveBob = &quot;08-19&quot;
  Output: 3
  Explanation: Alice will be in Rome from August 15 to August 18. Bob will be in Rome from August 16 to August 19. They are both in Rome together on August 16th, 17th, and 18th, so the answer is 3.

Example 2:
  Input:  arriveAlice = &quot;10-01&quot;, leaveAlice = &quot;10-31&quot;, arriveBob = &quot;11-01&quot;, leaveBob = &quot;12-31&quot;
  Output: 0
  Explanation: There is no day when Alice and Bob are in Rome together, so we return 0.
```

## 📐 Constraints
```
All dates are provided in the format &quot;MM-DD&quot;.
	Alice and Bob&#39;s arrival dates are earlier than or equal to their leaving dates.
	The given dates are valid dates of a non-leap year.
```

## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)

## 📊 Stats
- Runtime: 0 ms
- Memory: 40.31 MB
