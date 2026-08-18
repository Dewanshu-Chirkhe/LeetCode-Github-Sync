class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        boolean allZero = true;

        for(int ele : nums){
            xor ^= ele;
            if(ele != 0) allZero = false;
        }

        if(allZero) return 0;
        else if(xor == 0) return n-1;
        else return n;
    }
}