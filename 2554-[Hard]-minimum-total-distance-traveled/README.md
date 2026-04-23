# Minimum Total Distance Traveled

🔗 https://leetcode.com/problems/minimum-total-distance-traveled/

## 🧠 Approach
This solution uses a recursive approach with memoization to solve the problem. It sorts the robots and factories based on their positions, then iterates through each factory, calculating the minimum total distance traveled for each robot. The `helper` function is used to recursively calculate the minimum distance for each subproblem, and the results are stored in a 2D array to avoid redundant calculations.

## ⏱️ Complexity
- Time: O(n*m*min(n, m)), where n is the number of robots and m is the number of factories.
- Space: O(n*m), for the 2D array used for memoization.

## 📊 Stats
- Runtime: 40 ms
- Memory: 44.4 MB
