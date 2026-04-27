#  Check if There Is a Valid Parentheses String Path

🔗 https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/

## 📘 Problem
A parentheses string is a non-empty string consisting only of &#39;(&#39; and &#39;)&#39;. It is valid if any of the following conditions is true:

	It is ().
	It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
	It can be written as (A), where A is a valid parentheses string.

You are given an m x n matrix of parentheses grid. A valid parentheses string path in the grid is a path satisfying all of the following conditions:

	The path starts from the upper left cell (0, 0).
	The path ends at the bottom-right cell (m - 1, n - 1).
	The path only ever moves down or right.
	The resulting parentheses string formed by the path is valid.

Return true if there exists a valid parentheses string path in the grid. Otherwise, return false.

## 🧪 Examples
```
Example 1:
  Input:  grid = [[&quot;(&quot;,&quot;(&quot;,&quot;(&quot;],[&quot;)&quot;,&quot;(&quot;,&quot;)&quot;],[&quot;(&quot;,&quot;(&quot;,&quot;)&quot;],[&quot;(&quot;,&quot;(&quot;,&quot;)&quot;]]
  Output: true
  Explanation: The above diagram shows two possible paths that form valid parentheses strings.
The first path shown results in the valid parentheses string &quot;()(())&quot;.
The second path shown results in the valid parentheses string &quot;((()))&quot;.
Note that there may be other valid parentheses string paths.

Example 2:
  Input:  grid = [[&quot;)&quot;,&quot;)&quot;],[&quot;(&quot;,&quot;(&quot;]]
  Output: false
  Explanation: The two possible paths form the parentheses strings &quot;))(&quot; and &quot;)((&quot;. Since neither of them are valid parentheses strings, we return false.
```

## 📐 Constraints
```
m == grid.length
	n == grid[i].length
	1 <= m, n <= 100
	grid[i][j] is either &#39;(&#39; or &#39;)&#39;.
```

## 🧠 Approach
- The problem is solved using a depth-first search (DFS) approach with memoization to avoid redundant computations.
- The `compute` function checks if there is a valid path from the current position `(i, j)` to the bottom-right corner of the grid, given the current sum of parentheses.
- The function uses a 2D array `dp` to store the results of subproblems to avoid redundant computations.
- The base cases are when the current position is out of bounds, when the sum is negative, or when the current position is the bottom-right corner and the sum is zero.

## ⏱️ Complexity
- Time: O(m*n*(m+n)), where m and n are the dimensions of the grid.
- Space: O(m*n*(m+n)), where m and n are the dimensions of the grid.

## 📊 Stats
- Runtime: 65 ms
- Memory: 169.25 MB
