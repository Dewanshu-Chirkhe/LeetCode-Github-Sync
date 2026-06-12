# Split a String in Balanced Strings

🔗 https://leetcode.com/problems/split-a-string-in-balanced-strings/

## 📘 Problem
Balanced strings are those that have an equal quantity of &#39;L&#39; and &#39;R&#39; characters.

Given a balanced string s, split it into some number of substrings such that:

	Each substring is balanced.

Return the maximum number of balanced strings you can obtain.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;RLRRLLRLRL&quot;
  Output: 4
  Explanation: s can be split into &quot;RL&quot;, &quot;RRLL&quot;, &quot;RL&quot;, &quot;RL&quot;, each substring contains same number of &#39;L&#39; and &#39;R&#39;.

Example 2:
  Input:  s = &quot;RLRRRLLRLL&quot;
  Output: 2
  Explanation: s can be split into &quot;RL&quot;, &quot;RRRLLRLL&quot;, each substring contains same number of &#39;L&#39; and &#39;R&#39;.
Note that s cannot be split into &quot;RL&quot;, &quot;RR&quot;, &quot;RL&quot;, &quot;LR&quot;, &quot;LL&quot;, because the 2nd and 5th substrings are not balanced.

Example 3:
  Input:  s = &quot;LLLLRRRR&quot;
  Output: 1
  Explanation: s can be split into &quot;LLLLRRRR&quot;.
```

## 📐 Constraints
```
2 <= s.length <= 1000
	s[i] is either &#39;L&#39; or &#39;R&#39;.
	s is a balanced string.
```

## 🧠 Approach
- Initialize two variables, `balance` and `count`, to keep track of the balance of 'R's and 'L's and the number of balanced strings respectively.
- Iterate through each character in the string, incrementing `balance` when encountering 'R' and decrementing it when encountering 'L'.
- When `balance` becomes 0, it means we have found a balanced string, so increment `count`.
- Return `count` as the result.

## ⏱️ Complexity
- Time: O(n), where n is the length of the string, as we are iterating through each character once.
- Space: O(1), as we are using a constant amount of space to store the variables `balance` and `count`.

## 📊 Stats
- Runtime: 0 ms
- Memory: 40.79 MB
