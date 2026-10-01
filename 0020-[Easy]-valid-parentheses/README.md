# Valid Parentheses

🔗 https://leetcode.com/problems/valid-parentheses/

## 📘 Problem
Given a string s containing just the characters &#39;(&#39;, &#39;)&#39;, &#39;{&#39;, &#39;}&#39;, &#39;[&#39; and &#39;]&#39;, determine if the input string is valid.

An input string is valid if:

	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;()&quot;
  Output: true

Example 2:
  Input:  s = &quot;()[]{}&quot;
  Output: true

Example 3:
  Input:  s = &quot;(]&quot;
  Output: false

Example 4:
  Input:  s = &quot;([])&quot;
  Output: true

Example 5:
  Input:  s = &quot;([)]&quot;
  Output: false
```

## 📐 Constraints
```
1 <= s.length <= 104
	s consists of parentheses only &#39;()[]{}&#39;.
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
- Runtime: 4 ms
- Memory: 41.4 MB
