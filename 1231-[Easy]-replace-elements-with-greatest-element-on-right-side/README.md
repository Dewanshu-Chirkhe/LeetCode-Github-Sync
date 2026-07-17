# Replace Elements with Greatest Element on Right Side

🔗 https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

## 📘 Problem
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

## 🧪 Examples
```
Example 1:
  Input:  arr = [17,18,5,4,6,1]
  Output: [18,6,6,6,1,-1]
  Explanation: - index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.

Example 2:
  Input:  arr = [400]
  Output: [-1]
  Explanation: There are no elements to the right of index 0.
```

## 📐 Constraints
```
1 <= arr.length <= 104
	1 <= arr[i] <= 105
```

## 🧠 Approach
- Initialize the maximum element as the last element of the array and replace it with -1.
- Iterate through the array from the second last element to the first element.
- For each element, update the maximum element if the current element is greater and store the previous maximum element in the current position.
- Return the modified array.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 3 ms
- Memory: 46.61 MB
