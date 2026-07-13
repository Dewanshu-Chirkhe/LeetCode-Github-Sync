# Sequential Digits

🔗 https://leetcode.com/problems/sequential-digits/

## 📘 Problem
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

## 🧪 Examples
```
Example 1:
  Input:  low = 100, high = 300
  Output: [123,234]

Example 2:
  Input:  low = 1000, high = 13000
  Output: [1234,2345,3456,4567,5678,6789,12345]
```

## 📐 Constraints
```
10 <= low <= high <= 10^9
```

## 🧠 Approach
- The solution uses two nested loops to generate all possible sequential digits.
- The outer loop starts from 1 and goes up to 9, representing the starting digit of each sequence.
- The inner loop starts from the next digit of the current sequence and goes up to 9, adding each digit to the current number.
- If the generated number falls within the given range, it is added to the result list.

## ⏱️ Complexity
- Time: O(n*m), where n is the number of sequences and m is the maximum length of a sequence.
- Space: O(n), where n is the number of sequences in the result list.

## 📊 Stats
- Runtime: 0 ms
- Memory: 40.23 MB
