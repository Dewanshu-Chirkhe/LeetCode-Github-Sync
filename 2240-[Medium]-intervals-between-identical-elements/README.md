# Intervals Between Identical Elements

🔗 https://leetcode.com/problems/intervals-between-identical-elements/

## 🧠 Approach
This solution uses a hashmap to group identical elements and their indices. It then calculates the prefix sum for each group to efficiently calculate the intervals between identical elements. The intervals are calculated as the sum of the left and right distances from the current index.

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(n)

## 📊 Stats
- Runtime: 49 ms
- Memory: 172.21 MB
