# Furthest Point From Origin

🔗 https://leetcode.com/problems/furthest-point-from-origin/

## 📘 Problem
You are given a string moves of length n consisting only of characters &#39;L&#39;, &#39;R&#39;, and &#39;_&#39;. The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:


	move to the left if moves[i] = &#39;L&#39; or moves[i] = &#39;_&#39;
	move to the right if moves[i] = &#39;R&#39; or moves[i] = &#39;_&#39;


Return the distance from the origin of the furthest point you can get to after n moves.

 
Example 1:


Input: moves = &quot;L_RL__R&quot;
Output: 3
Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves &quot;LLRLLLR&quot;.


Example 2:


Input: moves = &quot;_R__LL_&quot;
Output: 5
Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves &quot;LRLLLLL&quot;.


Example 3:


Input: moves = &quot;_______&quot;
Output: 7
Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves &quot;RRRRRRR&quot;.


 
Constraints:


	1 <= moves.length == n <= 50
	moves consists only of characters &#39;L&#39;, &#39;R&#39; and &#39;_&#39;.

## 🧪 Examples
Example 1:
- Input: "L_RL__R"
- Output: "_R__LL_"

## 🧠 Approach
- The problem is solved by first counting the frequency of 'L' and 'R' moves in the input string.
- The character with higher frequency is chosen as the replacement for '_' in the input string.
- The modified string is then processed to calculate the final distance from the origin.
- The absolute value of the final distance is returned as the result.

## ⏱️ Complexity
- Time: O(n), where n is the length of the input string, as we need to iterate over the string twice.
- Space: O(n), as we need to store the frequency of each character in the map.

## 📊 Stats
- Runtime: 2 ms
- Memory: 42.23 MB
