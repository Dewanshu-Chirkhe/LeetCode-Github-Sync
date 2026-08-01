class Solution {
    Integer[][] dp;
    public int helper(int left , int right , boolean p1Turn , int[] nums){
        if(left > right) return 0;

        if(dp[left][right] != null) return dp[left][right];
        int ans;
        if(p1Turn){
            int takeLeft = nums[left] + helper(left+1 , right , !p1Turn , nums);
            int takeRight = nums[right] + helper(left , right-1 , !p1Turn , nums);
            ans = Math.max(takeLeft , takeRight);
        }
        else{
            int takeLeft = - nums[left] + helper(left+1 , right , !p1Turn , nums);
            int takeRight = - nums[right] + helper(left , right-1 , !p1Turn , nums);
            ans = Math.min(takeLeft , takeRight);
        }
        dp[left][right] = ans;
        return ans;
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return helper(0 , n-1 , true , nums) >= 0;
    }
}