# Minimum Add to Make Parentheses Valid

🔗 https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

## 📘 Problem
A parentheses string is valid if and only if:

	It is the empty string,
	It can be written as AB (A concatenated with B), where A and B are valid strings, or
	It can be written as (A), where A is a valid string.

You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

	For example, if s = &quot;()))&quot;, you can insert an opening parenthesis to be &quot;(()))&quot; or a closing parenthesis to be &quot;())))&quot;.

Return the minimum number of moves required to make s valid.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;())&quot;
  Output: 1

Example 2:
  Input:  s = &quot;(((&quot;
  Output: 3
```

## 📐 Constraints
```
1 <= s.length <= 1000
	s[i] is either &#39;(&#39; or &#39;)&#39;.
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
- Runtime: 1 ms
- Memory: 40.9 MB
