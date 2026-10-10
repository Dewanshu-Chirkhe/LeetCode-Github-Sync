# Remove Outermost Parentheses

🔗 https://leetcode.com/problems/remove-outermost-parentheses/

## 📘 Problem
A valid parentheses string is either empty &quot;&quot;, &quot;(&quot; + A + &quot;)&quot;, or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

	For example, &quot;&quot;, &quot;()&quot;, &quot;(())()&quot;, and &quot;(()(()))&quot; are all valid parentheses strings.

A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;(()())(())&quot;
  Output: &quot;()()()&quot;
  Explanation: The input string is &quot;(()())(())&quot;, with primitive decomposition &quot;(()())&quot; + &quot;(())&quot;.
After removing outer parentheses of each part, this is &quot;()()&quot; + &quot;()&quot; = &quot;()()()&quot;.

Example 2:
  Input:  s = &quot;(()())(())(()(()))&quot;
  Output: &quot;()()()()(())&quot;
  Explanation: The input string is &quot;(()())(())(()(()))&quot;, with primitive decomposition &quot;(()())&quot; + &quot;(())&quot; + &quot;(()(()))&quot;.
After removing outer parentheses of each part, this is &quot;()()&quot; + &quot;()&quot; + &quot;()(())&quot; = &quot;()()()()(())&quot;.

Example 3:
  Input:  s = &quot;()()&quot;
  Output: &quot;&quot;
  Explanation: The input string is &quot;()()&quot;, with primitive decomposition &quot;()&quot; + &quot;()&quot;.
After removing outer parentheses of each part, this is &quot;&quot; + &quot;&quot; = &quot;&quot;.
```

## 📐 Constraints
```
1 <= s.length <= 105
	s[i] is either &#39;(&#39; or &#39;)&#39;.
	s is a valid parentheses string.
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
- Runtime: 3 ms
- Memory: 41.6 MB
