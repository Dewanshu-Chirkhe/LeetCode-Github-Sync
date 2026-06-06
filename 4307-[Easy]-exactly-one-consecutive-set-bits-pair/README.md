# Exactly One Consecutive Set Bits Pair

🔗 https://leetcode.com/problems/exactly-one-consecutive-set-bits-pair/

## 📘 Problem
You are given an integer n.

Return true if its binary representation contains exactly one pair of consecutive set bits, and false otherwise.
The set bits in an integer are the 1&#39;s present when it is written in binary.

## 🧪 Examples
```
Example 1:
  Input:  nums = 6
  Output: true
  Explanation: Binary representation of 6 is 110.
	There is exactly one pair of consecutive set bits (&quot;11&quot;). Thus, the answer is true​​​​​​​.

Example 2:
  Input:  nums = 5
  Output: false
  Explanation: Binary representation of 5 is 101.
	There are no consecutive set bits. Thus, the answer is false​​​​​​​.
```

## 📐 Constraints
```
0 <= n <= 105
```

## 🧠 Approach
- Convert the given integer to its binary representation as a string.
- Iterate through the binary string, comparing each character with the next one.
- If a pair of consecutive '1's is found, increment the count.
- Return true if exactly one pair of consecutive '1's is found, false otherwise.

## ⏱️ Complexity
- Time: O(n), where n is the number of bits in the binary representation of the integer.
- Space: O(1), excluding the space required for the input and output, as the space complexity is constant.

## 📊 Stats
- Runtime: 1 ms
- Memory: 40.82 MB
