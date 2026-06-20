# Create Grid With Exactly One Path

🔗 https://leetcode.com/problems/create-grid-with-exactly-one-path/

## 📘 Problem
You are given two integers m and n, representing the number of rows and columns of a grid.

Construct any m x n grid consisting only of the characters &#39;.&#39; and &#39;#&#39;, where:

	&#39;.&#39; represents a free cell.
	&#39;#&#39; represents an obstacle cell.

A valid path is a sequence of free cells that:

	Starts at the top-left cell (0, 0).
	Ends at the bottom-right cell (m - 1, n - 1).
	Moves only:
	
		Right, from (i, j) to (i, j + 1), or
		Down, from (i, j) to (i + 1, j).
	
	

Return any grid such that there is exactly one valid path from the top-left cell to the bottom-right cell.

## 🧪 Examples
```
Example 1:
  Input:  m = 2, n = 3
  Output: [&quot;..#&quot;,&quot;#..&quot;]
  Explanation: The only valid path is: (0,0) &rarr; (0,1) &rarr; (1,1) &rarr; (1,2)

Example 2:
  Input:  m = 3, n = 3
  Output: [&quot;..#&quot;,&quot;#..&quot;,&quot;##.&quot;]
  Explanation: The only valid path is: (0,0) &rarr; (0,1) &rarr; (1,1) &rarr; (1,2) &rarr; (2,2)

Example 3:
  Input:  m = 1, n = 4
  Output: [&quot;....&quot;]
  Explanation: The only valid path is: (0,0) &rarr; (0,1) &rarr; (0,2) &rarr; (0,3)
```

## 📐 Constraints
```
1 <= m, n <= 25
```

## 🧠 Approach
- Initialize an array of strings `ans` with size `m` to store the grid rows.
- Iterate over each row `i` from 0 to `m-1`.
- If `i` is 0, fill the row with '.' (dot) characters using `Arrays.fill`.
- If `i` is not 0, fill the row with '#' (hash) characters, then replace the last character with '.'.

## ⏱️ Complexity
- Time: O(m*n)
- Space: O(m*n)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.35 MB
