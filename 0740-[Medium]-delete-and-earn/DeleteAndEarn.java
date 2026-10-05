class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int ele : nums) max = Math.max(max, ele);

        int[] freq = new int[max+1];
        for(int ele : nums){
            freq[ele] += 1;
        }

        int[] dp = new int[max+1];
        dp[0] = freq[0];
        dp[1] = freq[1];
        
        for(int i=2 ; i<=max ; i++){
            dp[i] = Math.max(
                dp[i-1],
                dp[i-2] + (freq[i] * i)
            );
        }

        return dp[max];
    }
}