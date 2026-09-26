# Evaluate the Bracket Pairs of a String

🔗 https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/

## 📘 Problem
You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.

	For example, in the string &quot;(name)is(age)yearsold&quot;, there are two bracket pairs that contain the keys &quot;name&quot; and &quot;age&quot;.

You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.

You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:

	Replace keyi and the bracket pair with the key&#39;s corresponding valuei.
	If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark &quot;?&quot; (without the quotation marks).

Each key will appear at most once in your knowledge. There will not be any nested brackets in s.

Return the resulting string after evaluating all of the bracket pairs.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;(name)is(age)yearsold&quot;, knowledge = [[&quot;name&quot;,&quot;bob&quot;],[&quot;age&quot;,&quot;two&quot;]]
  Output: &quot;bobistwoyearsold&quot;
  Explanation: The key &quot;name&quot; has a value of &quot;bob&quot;, so replace &quot;(name)&quot; with &quot;bob&quot;.
The key &quot;age&quot; has a value of &quot;two&quot;, so replace &quot;(age)&quot; with &quot;two&quot;.

Example 2:
  Input:  s = &quot;hi(name)&quot;, knowledge = [[&quot;a&quot;,&quot;b&quot;]]
  Output: &quot;hi?&quot;
  Explanation: As you do not know the value of the key &quot;name&quot;, replace &quot;(name)&quot; with &quot;?&quot;.

Example 3:
  Input:  s = &quot;(a)(a)(a)aaa&quot;, knowledge = [[&quot;a&quot;,&quot;yes&quot;]]
  Output: &quot;yesyesyesaaa&quot;
  Explanation: The same key can appear multiple times.
The key &quot;a&quot; has a value of &quot;yes&quot;, so replace all occurrences of &quot;(a)&quot; with &quot;yes&quot;.
Notice that the &quot;a&quot;s not in a bracket pair are not evaluated.
```

## 📐 Constraints
```
1 <= s.length <= 105
	0 <= knowledge.length <= 105
	knowledge[i].length == 2
	1 <= keyi.length, valuei.length <= 10
	s consists of lowercase English letters and round brackets &#39;(&#39; and &#39;)&#39;.
	Every open bracket &#39;(&#39; in s will have a corresponding close bracket &#39;)&#39;.
	The key in each bracket pair of s will be non-empty.
	There will not be any nested bracket pairs in s.
	keyi and valuei consist of lowercase English letters.
	Each keyi in knowledge is unique.
```

## 🧠 Approach
- Identify core logic
- Use proper data structure
- Optimize traversal
- Return result

## ⏱️ Complexity
- Time: O(N)
- Space: O(1)

## 📊 Stats
- Runtime: 205 ms
- Memory: 92.6 MB
