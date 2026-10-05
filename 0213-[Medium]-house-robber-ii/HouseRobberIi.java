class Solution {
    public int solve(int[] nums, int l, int r){
        if(l == r) return nums[l];

        int n = nums.length;
        int[] dp = new int[n];
        dp[l] = nums[l];
        dp[l+1] = Math.max(nums[l+1], nums[l]);

        for(int i=l+2 ; i<=r ; i++){
            dp[i] = Math.max(
                nums[i] + dp[i-2],
                dp[i-1]
            );
        }

        return dp[r];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int case1 = solve(nums, 0, n-2);
        int case2 = solve(nums, 1, n-1);

        return Math.max(case1, case2);
    }
}