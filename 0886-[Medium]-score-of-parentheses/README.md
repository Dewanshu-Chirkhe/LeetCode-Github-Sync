# Score of Parentheses

🔗 https://leetcode.com/problems/score-of-parentheses/

## 📘 Problem
Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:

	&quot;()&quot; has score 1.
	AB has score A + B, where A and B are balanced parentheses strings.
	(A) has score 2 * A, where A is a balanced parentheses string.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;()&quot;
  Output: 1

Example 2:
  Input:  s = &quot;(())&quot;
  Output: 2

Example 3:
  Input:  s = &quot;()()&quot;
  Output: 2
```

## 📐 Constraints
```
2 <= s.length <= 50
	s consists of only &#39;(&#39; and &#39;)&#39;.
	s is a balanced parentheses string.
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
- Memory: 40.68 MB
