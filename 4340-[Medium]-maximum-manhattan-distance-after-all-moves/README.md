# Maximum Manhattan Distance After All Moves

🔗 https://leetcode.com/problems/maximum-manhattan-distance-after-all-moves/

## 📘 Problem
You are given a string moves consisting of the characters &#39;U&#39;, &#39;D&#39;, &#39;L&#39;, &#39;R&#39;, and &#39;_&#39;.

Starting from the origin (0, 0), each character represents one move on a 2D plane:

	&#39;U&#39;: Move up by 1 unit.
	&#39;D&#39;: Move down by 1 unit.
	&#39;L&#39;: Move left by 1 unit.
	&#39;R&#39;: Move right by 1 unit.
	&#39;_&#39;: Can be independently replaced with any one of &#39;U&#39;, &#39;D&#39;, &#39;L&#39;, or &#39;R&#39;.

Return the maximum Manhattan distance from the origin that can be achieved after all moves have been performed.

## 🧪 Examples
```
Example 1:
  Input:  moves = &quot;L_D_&quot;
  Output: 4
  Explanation: One optimal choice is:

	&#39;L&#39;: (0, 0) -> (-1, 0)
	&#39;_&#39; treated as &#39;D&#39;: (-1, 0) -> (-1, -1)
	&#39;D&#39;: (-1, -1) -> (-1, -2)
	&#39;_&#39; treated as &#39;L&#39;: (-1, -2) -> (-2, -2)

The final Manhattan distance from the origin is |0 - (-2)| + |0 - (-2)| = 4.

Example 2:
  Input:  moves = &quot;U_R&quot;
  Output: 3
  Explanation: One optimal choice is:

	&#39;U&#39;: (0, 0) -> (0, 1)
	&#39;_&#39; treated as &#39;U&#39;: (0, 1) -> (0, 2)
	&#39;R&#39;: (0, 2) -> (1, 2)

The final Manhattan distance from the origin is |0 - 1| + |0 - 2| = 3.
```

## 📐 Constraints
```
1 <= moves.length <= 105
	moves consists of only &#39;U&#39;, &#39;D&#39;, &#39;L&#39;, &#39;R&#39;, and &#39;_&#39;.
```

## 🧠 Approach
- The problem is solved by iterating over the given string of moves and updating the x and y coordinates accordingly.
- The count of '_' moves is also tracked to calculate the maximum Manhattan distance.
- After iterating over all moves, the Manhattan distance is calculated as the sum of the absolute values of x and y coordinates, and then added to the count of '_' moves.
- The final Manhattan distance is returned as the result.

## ⏱️ Complexity
- Time: O(n), where n is the length of the input string moves.
- Space: O(1), as the space complexity is constant and does not depend on the input size.

## 📊 Stats
- Runtime: 16 ms
- Memory: 45.63 MB
