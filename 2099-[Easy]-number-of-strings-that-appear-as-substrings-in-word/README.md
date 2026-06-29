# Number of Strings That Appear as Substrings in Word

🔗 https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

## 📘 Problem
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string.

## 🧪 Examples
```
Example 1:
  Input:  patterns = [&quot;a&quot;,&quot;abc&quot;,&quot;bc&quot;,&quot;d&quot;], word = &quot;abc&quot;
  Output: 3
  Explanation: - &quot;a&quot; appears as a substring in &quot;abc&quot;.
- &quot;abc&quot; appears as a substring in &quot;abc&quot;.
- &quot;bc&quot; appears as a substring in &quot;abc&quot;.
- &quot;d&quot; does not appear as a substring in &quot;abc&quot;.
3 of the strings in patterns appear as a substring in word.

Example 2:
  Input:  patterns = [&quot;a&quot;,&quot;b&quot;,&quot;c&quot;], word = &quot;aaaaabbbbb&quot;
  Output: 2
  Explanation: - &quot;a&quot; appears as a substring in &quot;aaaaabbbbb&quot;.
- &quot;b&quot; appears as a substring in &quot;aaaaabbbbb&quot;.
- &quot;c&quot; does not appear as a substring in &quot;aaaaabbbbb&quot;.
2 of the strings in patterns appear as a substring in word.

Example 3:
  Input:  patterns = [&quot;a&quot;,&quot;a&quot;,&quot;a&quot;], word = &quot;ab&quot;
  Output: 3
  Explanation: Each of the patterns appears as a substring in word &quot;ab&quot;.
```

## 📐 Constraints
```
1 <= patterns.length <= 100
	1 <= patterns[i].length <= 100
	1 <= word.length <= 100
	patterns[i] and word consist of lowercase English letters.
```

## 🧠 Approach
- The problem is solved using a simple iteration over the given array of patterns.
- For each pattern, it checks if the word contains the pattern as a substring.
- If the word contains the pattern, it increments the answer counter.
- The solution uses the built-in `contains` method of the String class in Java, which has a time complexity of O(n), where n is the length of the word.

## ⏱️ Complexity
- Time: O(n * m), where n is the length of the word and m is the total length of all patterns.
- Space: O(1), excluding the space required for the input and output, as it only uses a constant amount of space to store the answer and the current pattern.

## 📊 Stats
- Runtime: 1 ms
- Memory: 41.23 MB
