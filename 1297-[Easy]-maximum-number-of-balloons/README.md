# Maximum Number of Balloons

🔗 https://leetcode.com/problems/maximum-number-of-balloons/

## 📘 Problem
Given a string text, you want to use the characters of text to form as many instances of the word &quot;balloon&quot; as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

## 🧪 Examples
```
Example 1:
  Input:  text = &quot;nlaebolko&quot;
  Output: 1

Example 2:
  Input:  text = &quot;loonbalxballpoon&quot;
  Output: 2

Example 3:
  Input:  text = &quot;leetcode&quot;
  Output: 0
```

## 📐 Constraints
```
1 <= text.length <= 104
	text consists of lower case English letters only.

 
Note: This question is the same as  2287: Rearrange Characters to Make Target String.
```

## 🧠 Approach
- The problem is solved by first counting the frequency of each character in the given string using a HashMap.
- Then, the minimum count of each character is found, considering that the character 'l' and 'o' appear twice in the word "balloon".
- The minimum count is used as the maximum number of balloons that can be formed.
- The time complexity is O(n) where n is the length of the string, and the space complexity is O(1) as the size of the HashMap is constant.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 10 ms
- Memory: 42.14 MB
