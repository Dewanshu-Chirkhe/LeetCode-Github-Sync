# Minimum Operations to Sort a String

🔗 https://leetcode.com/problems/minimum-operations-to-sort-a-string/

## 📘 Problem
You are given a string s consisting of lowercase English letters.

In one operation, you can select any substring of s that is not the entire string and sort it in non-descending alphabetical order.

Return the minimum number of operations required to make s sorted in non-descending order. If it is not possible, return -1.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;dog&quot;
  Output: 1
  Explanation: ​​​​​​​

	Sort substring &quot;og&quot; to &quot;go&quot;.
	Now, s = &quot;dgo&quot;, which is sorted in ascending order. Thus, the answer is 1.

Example 2:
  Input:  s = &quot;card&quot;
  Output: 2
  Explanation: Sort substring &quot;car&quot; to &quot;acr&quot;, so s = &quot;acrd&quot;.
	Sort substring &quot;rd&quot; to &quot;dr&quot;, making s = &quot;acdr&quot;, which is sorted in ascending order. Thus, the answer is 2.

Example 3:
  Input:  s = &quot;gf&quot;
  Output: -1
  Explanation: It is impossible to sort s under the given constraints. Thus, the answer is -1.
```

## 📐 Constraints
```
1 <= s.length <= 105
	s consists of only lowercase English letters.
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
- Runtime: 21 ms
- Memory: 44.75 MB
