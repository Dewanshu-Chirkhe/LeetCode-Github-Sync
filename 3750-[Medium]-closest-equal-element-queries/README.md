# Closest Equal Element Queries

🔗 https://leetcode.com/problems/closest-equal-element-queries/

## 🧠 Approach
This solution utilizes a HashMap to store the indices of equal elements in the input array. It then iterates through the queries, finding the closest equal element to the current index by performing a binary search on the list of indices. The closest equal element is determined by considering both the next and previous indices in the list.

## ⏱️ Complexity
- Time: O(n + q log q)
- Space: O(n)

## 📊 Stats
- Runtime: 114 ms
- Memory: 173.66 MB
