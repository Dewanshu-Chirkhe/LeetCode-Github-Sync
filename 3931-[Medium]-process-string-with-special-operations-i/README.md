# Process String with Special Operations I

🔗 https://leetcode.com/problems/process-string-with-special-operations-i/

## 📘 Problem
You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

Build a new string result by processing s according to the following rules from left to right:

	If the letter is a lowercase English letter append it to result.
	A &#39;*&#39; removes the last character from result, if it exists.
	A &#39;#&#39; duplicates the current result and appends it to itself.
	A &#39;%&#39; reverses the current result.

Return the final string result after processing all characters in s.

## 🧪 Examples
```
Example 1:
  Input:  s = &quot;a#b%*&quot;
  Output: &quot;ba&quot;
  Explanation: i
			s[i]
			Operation
			Current result
		
	
	
		
			0
			&#39;a&#39;
			Append &#39;a&#39;
			&quot;a&quot;
		
		
			1
			&#39;#&#39;
			Duplicate result
			&quot;aa&quot;
		
		
			2
			&#39;b&#39;
			Append &#39;b&#39;
			&quot;aab&quot;
		
		
			3
			&#39;%&#39;
			Reverse result
			&quot;baa&quot;
		
		
			4
			&#39;*&#39;
			Remove the last character
			&quot;ba&quot;
		
	

Thus, the final result is &quot;ba&quot;.

Example 2:
  Input:  s = &quot;z*#&quot;
  Output: &quot;&quot;
  Explanation: i
			s[i]
			Operation
			Current result
		
	
	
		
			0
			&#39;z&#39;
			Append &#39;z&#39;
			&quot;z&quot;
		
		
			1
			&#39;*&#39;
			Remove the last character
			&quot;&quot;
		
		
			2
			&#39;#&#39;
			Duplicate the string
			&quot;&quot;
		
	

Thus, the final result is &quot;&quot;.
```

## 📐 Constraints
```
1 <= s.length <= 20
	s consists of only lowercase English letters and special characters *, #, and %.
```

## 🧠 Approach
- Initialize a StringBuilder to store the processed string.
- Iterate through each character in the input string, applying special operations based on the character type.
  - If the character is a letter, append it to the StringBuilder.
  - If the character is '*', remove the last character from the StringBuilder if it's not empty.
  - If the character is '#', append the entire StringBuilder to itself.
  - If the character is '%', reverse the StringBuilder.
- Return the processed string as a result.

## ⏱️ Complexity
- Time: O(n), where n is the length of the input string, as we're iterating through each character once.
- Space: O(n), as in the worst case, we might need to store the entire input string in the StringBuilder.

## 📊 Stats
- Runtime: 4 ms
- Memory: 52.84 MB
