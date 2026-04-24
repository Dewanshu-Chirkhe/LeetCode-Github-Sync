# Mirror Distance of an Integer

🔗 https://leetcode.com/problems/mirror-distance-of-an-integer/

## 📘 Problem
You are given an integer n.

Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n.

Return an integer denoting the mirror distance of n​​​​​​​.

abs(x) denotes the absolute value of x.

 
Example 1:


Input: n = 25

Output: 27

Explanation:


	reverse(25) = 52.
	Thus, the answer is abs(25 - 52) = 27.



Example 2:


Input: n = 10

Output: 9

Explanation:


	reverse(10) = 01 which is 1.
	Thus, the answer is abs(10 - 1) = 9.



Example 3:


Input: n = 7

Output: 0

Explanation:


	reverse(7) = 7.
	Thus, the answer is abs(7 - 7) = 0.



 
Constraints:


	1 <= n <= 109

## 🧪 Examples
Example 1:
- Input: 25
- Output: 10

## 🧠 Approach
- The problem requires finding the mirror distance of an integer, which is the absolute difference between the integer and its reverse.
- To reverse an integer, we use a while loop to extract the last digit (num % 10), add it to the reversed number (rev), and remove the last digit from the original number (num /= 10).
- We multiply the reversed number by 10 in each iteration to shift the digits to the left and make space for the new digit.
- The mirror distance is then calculated by taking the absolute difference between the original number and its reverse.

## ⏱️ Complexity
- Time: O(log(n)), where n is the input integer, because the while loop runs until the number becomes 0, which takes log(n) iterations.
- Space: O(1), because we only use a constant amount of space to store the reversed number and the original number.

## 📊 Stats
- Runtime: 1 ms
- Memory: 40.53 MB
