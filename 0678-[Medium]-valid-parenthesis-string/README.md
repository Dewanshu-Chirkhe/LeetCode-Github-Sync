# Valid Parenthesis String

🔗 https://leetcode.com/problems/valid-parenthesis-string/

## 📘 Problem
Given a string s containing only three types of characters: &#39;(&#39;, &#39;)&#39; and &#39;*&#39;, return true if s is valid.

The following rules define a valid string:

	Any left parenthesis &#39;(&#39; must have a corresponding right parenthesis &#39;)&#39;.
	Any right parenthesis &#39;)&#39; must have a corresponding left parenthesis &#39;(&#39;.
	Left parenthesis &#39;(&#39; must go before the corresponding right parenthesis &#39;)&#39;.
	&#39;*&#39; could be treated as a single right parenthesis &#39;)&#39; or a single left parenthesis &#39;(&#39; or an empty string &quot;&quot;.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;()&quot;
  Output: true

Example 2:
  Input:  s = &quot;(*)&quot;
  Output: true

Example 3:
  Input:  s = &quot;(*))&quot;
  Output: true

Example 4:
  Input:  s = &quot;(&quot;
  Output: false
```

## 📐 Constraints
```
1 <= s.length <= 100
	s[i] is &#39;(&#39;, &#39;)&#39; or &#39;*&#39;.
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
- Memory: 41.9 MB
