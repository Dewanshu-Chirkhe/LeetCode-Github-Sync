# Minimum Number of Pushes to Type Word II

🔗 https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

## 📘 Problem
You are given a string word containing lowercase English letters.

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
  Input:  word = &quot;xyzxyzxyzxyz&quot;
  Output: 12
  Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;x&quot; -> one push on key 2
&quot;y&quot; -> one push on key 3
&quot;z&quot; -> one push on key 4
Total cost is 1 * 4 + 1 * 4 + 1 * 4 = 12
It can be shown that no other mapping can provide a lower cost.
Note that the key 9 is not mapped to any letter: it is not necessary to map letters to every key, but to map all the letters.

Example 3:
  Input:  word = &quot;aabbccddeeffgghhiiiiii&quot;
  Output: 24
  Explanation: The remapped keypad given in the image provides the minimum cost.
&quot;a&quot; -> one push on key 2
&quot;b&quot; -> one push on key 3
&quot;c&quot; -> one push on key 4
&quot;d&quot; -> one push on key 5
&quot;e&quot; -> one push on key 6
&quot;f&quot; -> one push on key 7
&quot;g&quot; -> one push on key 8
&quot;h&quot; -> two pushes on key 9
&quot;i&quot; -> one push on key 9
Total cost is 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 2 * 2 + 6 * 1 = 24.
It can be shown that no other mapping can provide a lower cost.
```

## 📐 Constraints
```
1 <= word.length <= 105
	word consists of lowercase English letters.
```

## 🧠 Approach
- The problem is solved by first counting the frequency of each character in the given word using a HashMap.
- The frequency of each character is then stored in a list and sorted in descending order.
- The minimum number of pushes required is calculated by iterating over the sorted frequency list and adding the product of the frequency and the minimum number of pushes required for that frequency (calculated as i/8 + 1, where i is the index of the frequency).
- The minimum number of pushes required for a frequency is calculated as the ceiling of the frequency divided by 8, which is equivalent to i/8 + 1.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting of the frequency list, where n is the number of unique characters in the word.
- Space: O(n) for storing the frequency of each character in the HashMap and the sorted frequency list.

## 📊 Stats
- Runtime: 63 ms
- Memory: 45.64 MB
