# Minimum Number of Pushes to Type Word I

🔗 https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/

## 📘 Problem
You are given a string word containing distinct lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with [&quot;a&quot;,&quot;b&quot;,&quot;c&quot;], we need to push the key one time to type &quot;a&quot;, two times to type &quot;b&quot;, and three times to type &quot;c&quot; .

It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.

Return the minimum number of pushes needed to type word after remapping the keys.

An example mapping of letters to keys on a telephone keypad is given below. Note that 1, *, #, and 0 do not map to any letters.

## 🧪 Examples
```
Example 1:
  Input:  word = &quot;abcde&quot;
  Output: 5
  Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;a&quot; -> one push on key 2
&quot;b&quot; -> one push on key 3
&quot;c&quot; -> one push on key 4
&quot;d&quot; -> one push on key 5
&quot;e&quot; -> one push on key 6
Total cost is 1 + 1 + 1 + 1 + 1 = 5.
It can be shown that no other mapping can provide a lower cost.

Example 2:
  Input:  word = &quot;xycdefghij&quot;
  Output: 12
  Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;x&quot; -> one push on key 2
&quot;y&quot; -> two pushes on key 2
&quot;c&quot; -> one push on key 3
&quot;d&quot; -> two pushes on key 3
&quot;e&quot; -> one push on key 4
&quot;f&quot; -> one push on key 5
&quot;g&quot; -> one push on key 6
&quot;h&quot; -> one push on key 7
&quot;i&quot; -> one push on key 8
&quot;j&quot; -> one push on key 9
Total cost is 1 + 2 + 1 + 2 + 1 + 1 + 1 + 1 + 1 + 1 = 12.
It can be shown that no other mapping can provide a lower cost.
```

## 📐 Constraints
```
1 <= word.length <= 26
	word consists of lowercase English letters.
	All letters in word are distinct.
```

## 🧠 Approach
- The problem is solved by iterating over each character in the given word.
- For each character at index `i`, the number of pushes required is calculated as `i / 8 + 1`.
- This is because each row of the keyboard has 8 keys, and the number of pushes required to type a character is the row number plus one.
- The total number of pushes is the sum of pushes required for each character.

## ⏱️ Complexity
- Time: O(n), where n is the length of the word, as we are iterating over each character once.
- Space: O(1), as we are using a constant amount of space to store the total number of pushes and the length of the word.

## 📊 Stats
- Runtime: 0 ms
- Memory: 41.26 MB
