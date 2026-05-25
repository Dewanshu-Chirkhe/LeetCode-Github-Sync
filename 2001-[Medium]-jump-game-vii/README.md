# Jump Game VII

🔗 https://leetcode.com/problems/jump-game-vii/

## 📘 Problem
You are given a 0-indexed binary string s and two integers minJump and maxJump. In the beginning, you are standing at index 0, which is equal to &#39;0&#39;. You can move from index i to index j if the following conditions are fulfilled:

	i + minJump <= j <= min(i + maxJump, s.length - 1), and
	s[j] == &#39;0&#39;.

Return true if you can reach index s.length - 1 in s, or false otherwise.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;011010&quot;, minJump = 2, maxJump = 3
  Output: true
  Explanation: In the first step, move from index 0 to index 3. 
In the second step, move from index 3 to index 5.

Example 2:
  Input:  s = &quot;01101110&quot;, minJump = 2, maxJump = 3
  Output: false
```

## 📐 Constraints
```
2 <= s.length <= 105
	s[i] is either &#39;0&#39; or &#39;1&#39;.
	s[0] == &#39;0&#39;
	1 <= minJump <= maxJump < s.length
```

## 🧠 Approach
- The problem is solved using a breadth-first search (BFS) approach with a queue data structure.
- The queue stores the indices of the characters in the string that can be reached from the current index.
- The `visited` array keeps track of the indices that have been visited to avoid revisiting them.
- The `farthest` variable keeps track of the farthest index that can be reached from the current index.

## ⏱️ Complexity
- Time: O(n), where n is the length of the string, because each character is visited at most once.
- Space: O(n), where n is the length of the string, because in the worst case, all characters need to be stored in the queue and the `visited` array.

## 📊 Stats
- Runtime: 16 ms
- Memory: 53.81 MB
