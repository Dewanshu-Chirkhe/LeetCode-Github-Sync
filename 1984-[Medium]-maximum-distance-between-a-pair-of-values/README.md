# Maximum Distance Between a Pair of Values

🔗 https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/

## 🧠 Approach
This solution uses a two-pointer technique to traverse both arrays simultaneously. It keeps track of the maximum distance between a pair of values by comparing the current elements of the two arrays. If the current element in `nums1` is less than or equal to the current element in `nums2`, it increments the distance and updates the maximum distance. Otherwise, it increments the pointer for `nums1`.

## ⏱️ Complexity
- Time: O(n + m)
- Space: O(1)

## 📊 Stats
- Runtime: 3 ms
- Memory: 86.22 MB
