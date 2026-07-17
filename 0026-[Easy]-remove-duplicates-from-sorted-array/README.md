# Remove Duplicates from Sorted Array

🔗 https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## 📘 Problem
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}

If all assertions pass, then your solution will be accepted.

## 🧪 Examples
```
Example 1:
  Input:  nums = [1,1,2]
  Output: 2, nums = [1,2,_]
  Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
  Input:  nums = [0,0,1,1,1,2,2,3,3,4]
  Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
  Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

## 📐 Constraints
```
1 <= nums.length <= 3 * 104
	-100 <= nums[i] <= 100
	nums is sorted in non-decreasing order.
```

## 🧠 Approach
- The problem is solved using a two-pointer technique, where one pointer (`i`) is used to track the position of the next unique element, and the other pointer (`j`) is used to traverse the array.
- The `i` pointer is initialized to 0, and the `j` pointer starts from the second element (index 1) of the array.
- When a unique element is found at the `j` pointer, it is copied to the position `i+1`, and the `i` pointer is incremented.
- The function returns the number of unique elements in the array, which is `i+1`.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## 📊 Stats
- Runtime: 1 ms
- Memory: 44.51 MB
