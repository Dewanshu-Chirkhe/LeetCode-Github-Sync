# Sum of GCD of Formed Pairs

🔗 https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/

## 📘 Problem
You are given an integer array nums of length n.

Construct an array prefixGcd where for each index i:

	Let mxi = max(nums[0], nums[1], ..., nums[i]).
	prefixGcd[i] = gcd(nums[i], mxi).

After constructing prefixGcd:

	Sort prefixGcd in non-decreasing order.
	Form pairs by taking the smallest unpaired element and the largest unpaired element.
	Repeat this process until no more pairs can be formed.
	For each formed pair, compute the gcd of the two elements.
	If n is odd, the middle element in the prefixGcd array remains unpaired and should be ignored.

Return an integer denoting the sum of the GCD values of all formed pairs.
The term gcd(a, b) denotes the greatest common divisor of a and b.

## 🧪 Examples
```
Example 1:
  Input:  nums = [2,6,4]
  Output: 2
  Explanation: Construct prefixGcd:

	
		
			i
			nums[i]
			mxi
			prefixGcd[i]
		
	
	
		
			0
			2
			2
			2
		
		
			1
			6
			6
			6
		
		
			2
			4
			6
			2
		
	

prefixGcd = [2, 6, 2]. After sorting, it forms [2, 2, 6].

Example 2:
  Input:  nums = [3,6,2,8]
  Output: 5
  Explanation: Construct prefixGcd:

	
		
			i
			nums[i]
			mxi
			prefixGcd[i]
		
	
	
		
			0
			3
			3
			3
		
		
			1
			6
			6
			6
		
		
			2
			2
			6
			2
		
		
			3
			8
			8
			8
		
	

prefixGcd = [3, 6, 2, 8]. After sorting, it forms [2, 3, 6, 8].
```

## 📐 Constraints
```
1 <= n == nums.length <= 105
	1 <= nums[i] <= 10​​​​​​​9
```

## 🧠 Approach
- The problem requires finding the sum of GCDs of all possible pairs formed from the given array of numbers.
- To solve this, we first create a prefix array where each element is the GCD of the current number and the maximum number seen so far.
- We then sort the prefix array in ascending order.
- Finally, we iterate through the sorted prefix array from both ends, calculating the GCD of each pair and adding it to the result.

## ⏱️ Complexity
- Time: O(n log n) due to the sorting operation, where n is the length of the input array.
- Space: O(n) for storing the prefix array.

## 📊 Stats
- Runtime: 60 ms
- Memory: 120.01 MB
