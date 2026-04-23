# Smallest Stable Index I

🔗 https://leetcode.com/problems/smallest-stable-index-i/

## 🧠 Approach
Two arrays `max` and `min` are used to store the maximum and minimum values from the end and start of the array respectively. The difference between these values for each index is calculated and compared to `k`. The first index where the difference is less than or equal to `k` is considered the smallest stable index.

## ⏱️ Complexity
- Time: O(n)
- Space: O(n)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.14 MB
