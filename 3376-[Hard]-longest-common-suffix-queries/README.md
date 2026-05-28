# Longest Common Suffix Queries

🔗 https://leetcode.com/problems/longest-common-suffix-queries/

## 📘 Problem
You are given two arrays of strings wordsContainer and wordsQuery.

For each wordsQuery[i], you need to find a string from wordsContainer that has the longest common suffix with wordsQuery[i]. If there are two or more strings in wordsContainer that share the longest common suffix, find the string that is the smallest in length. If there are two or more such strings that have the same smallest length, find the one that occurred earlier in wordsContainer.

Return an array of integers ans, where ans[i] is the index of the string in wordsContainer that has the longest common suffix with wordsQuery[i].

## 🧪 Examples
```
Example 1:
  Input:  wordsContainer = [&quot;abcd&quot;,&quot;bcd&quot;,&quot;xbcd&quot;], wordsQuery = [&quot;cd&quot;,&quot;bcd&quot;,&quot;xyz&quot;]
  Output: [1,1,1]
  Explanation: Let&#39;s look at each wordsQuery[i] separately:

	For wordsQuery[0] = &quot;cd&quot;, strings from wordsContainer that share the longest common suffix &quot;cd&quot; are at indices 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.
	For wordsQuery[1] = &quot;bcd&quot;, strings from wordsContainer that share the longest common suffix &quot;bcd&quot; are at indices 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.
	For wordsQuery[2] = &quot;xyz&quot;, there is no string from wordsContainer that shares a common suffix. Hence the longest common suffix is &quot;&quot;, that is shared with strings at index 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.

Example 2:
  Input:  wordsContainer = [&quot;abcdefgh&quot;,&quot;poiuygh&quot;,&quot;ghghgh&quot;], wordsQuery = [&quot;gh&quot;,&quot;acbfgh&quot;,&quot;acbfegh&quot;]
  Output: [2,0,2]
  Explanation: Let&#39;s look at each wordsQuery[i] separately:

	For wordsQuery[0] = &quot;gh&quot;, strings from wordsContainer that share the longest common suffix &quot;gh&quot; are at indices 0, 1, and 2. Among these, the answer is the string at index 2 because it has the shortest length of 6.
	For wordsQuery[1] = &quot;acbfgh&quot;, only the string at index 0 shares the longest common suffix &quot;fgh&quot;. Hence it is the answer, even though the string at index 2 is shorter.
	For wordsQuery[2] = &quot;acbfegh&quot;, strings from wordsContainer that share the longest common suffix &quot;gh&quot; are at indices 0, 1, and 2. Among these, the answer is the string at index 2 because it has the shortest length of 6.
```

## 📐 Constraints
```
1 <= wordsContainer.length, wordsQuery.length <= 104
	1 <= wordsContainer[i].length <= 5 * 103
	1 <= wordsQuery[i].length <= 5 * 103
	wordsContainer[i] consists only of lowercase English letters.
	wordsQuery[i] consists only of lowercase English letters.
	Sum of wordsContainer[i].length is at most 5 * 105.
	Sum of wordsQuery[i].length is at most 5 * 105.
```

## 🧠 Approach
- The problem is solved using a Trie data structure, which is a tree-like data structure where each node is associated with a string.
- The Trie is used to store the suffixes of the given words, where each node represents a common suffix.
- The `insert` method is used to insert the suffixes of the words into the Trie, and the `prefix` method is used to find the index of the longest common suffix for a given query.
- The `stringIndices` method is the main method that uses the Trie to find the indices of the longest common suffixes for the given queries.

## ⏱️ Complexity
- Time: O(N * M), where N is the number of words and M is the maximum length of a word.
- Space: O(N * M), where N is the number of words and M is the maximum length of a word.

## 📊 Stats
- Runtime: 48 ms
- Memory: 270.14 MB
