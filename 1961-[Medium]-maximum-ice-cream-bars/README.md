# Maximum Ice Cream Bars

🔗 https://leetcode.com/problems/maximum-ice-cream-bars/

## 📘 Problem
It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 

Note: The boy can buy the ice cream bars in any order.

Return the maximum number of ice cream bars the boy can buy with coins coins.

You must solve the problem by counting sort.

## 🧪 Examples
```
Example 1:
  Input:  costs = [1,3,2,4,1], coins = 7
  Output: 4
  Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

Example 2:
  Input:  costs = [10,6,8,7,7,8], coins = 5
  Output: 0
  Explanation: The boy cannot afford any of the ice cream bars.

Example 3:
  Input:  costs = [1,6,3,1,2,5], coins = 20
  Output: 6
  Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
```

## 📐 Constraints
```
costs.length == n
	1 <= n <= 105
	1 <= costs[i] <= 105
	1 <= coins <= 108
```

## 🧠 Approach
- The problem is solved using a greedy algorithm, which sorts the costs array in ascending order.
- The algorithm then iterates through the sorted array, adding the cost of each ice cream bar to the total price as long as the total price does not exceed the available coins.
- The count of ice cream bars that can be purchased is incremented each time a bar is added to the total price.
- The algorithm breaks out of the loop as soon as the total price exceeds the available coins.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation, where n is the number of ice cream bars.
- Space: O(1) excluding the space required for the output, as the space complexity is constant and does not grow with the input size.

## 📊 Stats
- Runtime: 37 ms
- Memory: 80.24 MB
