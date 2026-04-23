# Sum of Distances

🔗 https://leetcode.com/problems/sum-of-distances/

## 🧠 Approach
This solution utilizes a hashmap to store the indices of each number in the input array. It then iterates over the hashmap values, calculating the prefix sum of each list of indices. The sum of distances for each number is calculated using the prefix sum and the indices of its occurrences.

## ⏱️ Complexity
- Time: O(n^2)
- Space: O(n)

## 📊 Stats
- Runtime: 23 ms
- Memory: 111.95 MB
