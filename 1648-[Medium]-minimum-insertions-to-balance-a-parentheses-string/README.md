# Minimum Insertions to Balance a Parentheses String

🔗 https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

## 📘 Problem
Given a parentheses string s containing only the characters &#39;(&#39; and &#39;)&#39;. A parentheses string is balanced if:

	Any left parenthesis &#39;(&#39; must have a corresponding two consecutive right parenthesis &#39;))&#39;.
	Left parenthesis &#39;(&#39; must go before the corresponding two consecutive right parenthesis &#39;))&#39;.

In other words, we treat &#39;(&#39; as an opening parenthesis and &#39;))&#39; as a closing parenthesis.

	For example, &quot;())&quot;, &quot;())(())))&quot; and &quot;(())())))&quot; are balanced, &quot;)()&quot;, &quot;()))&quot; and &quot;(()))&quot; are not balanced.

You can insert the characters &#39;(&#39; and &#39;)&#39; at any position of the string to balance it if needed.

Return the minimum number of insertions needed to make s balanced.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;(()))&quot;
  Output: 1
  Explanation: The second &#39;(&#39; has two matching &#39;))&#39;, but the first &#39;(&#39; has only &#39;)&#39; matching. We need to add one more &#39;)&#39; at the end of the string to be &quot;(())))&quot; which is balanced.

Example 2:
  Input:  s = &quot;())&quot;
  Output: 0
  Explanation: The string is already balanced.

Example 3:
  Input:  s = &quot;))())(&quot;
  Output: 3
  Explanation: Add &#39;(&#39; to match the first &#39;))&#39;, Add &#39;))&#39; to match the last &#39;(&#39;.
```

## 📐 Constraints
```
1 <= s.length <= 105
	s consists of &#39;(&#39; and &#39;)&#39; only.
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
- Runtime: 11 ms
- Memory: 45.24 MB
