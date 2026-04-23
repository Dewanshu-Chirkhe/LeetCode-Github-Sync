# Minimum Operations to Transform Array into Alternating Prime

🔗 https://leetcode.com/problems/minimum-operations-to-transform-array-into-alternating-prime/

## 🧠 Approach
This solution iterates through the input array, replacing non-prime elements at even indices with the next prime number and incrementing prime elements at odd indices until a non-prime number is found. It uses two helper functions to check primality and find the next prime number.

## ⏱️ Complexity
- Time: O(n * sqrt(n))
- Space: O(1)

## 📊 Stats
- Runtime: 330 ms
- Memory: 89.25 MB
