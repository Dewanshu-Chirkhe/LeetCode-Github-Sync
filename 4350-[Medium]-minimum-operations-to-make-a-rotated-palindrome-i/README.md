# Minimum Operations to Make a Rotated Palindrome I

🔗 https://leetcode.com/problems/minimum-operations-to-make-a-rotated-palindrome-i/

## 📘 Problem
You are given a string s consisting of lowercase English letters.

You can perform the following operations any number of times (including zero) and in any order:

	Increment: Choose any index i and replace s[i] with the next lowercase English letter. The letter after &#39;z&#39; is &#39;a&#39;.
	Left rotate: Move the first character of the string to the end.

Return the minimum number of operations required to make s a palindrome.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;abc&quot;
  Output: 2
  Explanation: One optimal solution:

	Left rotate the string: &quot;abc&quot; -> &quot;bca&quot;.
	Increment &#39;a&#39; to &#39;b&#39;: &quot;bca&quot; -> &quot;bcb&quot;.
	&quot;bcb&quot; is a palindrome. Thus, the answer is 2.

Example 2:
  Input:  s = &quot;yb&quot;
  Output: 3
  Explanation: Increment the first character three times: &quot;yb&quot; -> &quot;zb&quot; -> &quot;ab&quot; -> &quot;bb&quot;.
	&quot;bb&quot; is a palindrome. Thus, the answer is 3.
```

## 📐 Constraints
```
2 <= s.length <= 2000
	s consists only of lowercase English letters.
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
- Runtime: 422 ms
- Memory: 42.08 MB
