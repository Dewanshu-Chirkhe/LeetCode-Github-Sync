class Solution {
    Integer[][] dp;
    public int helper(int left, int right, boolean aTurn, int[] piles){
        if(left > right) return 0;

        if(dp[left][right] != null) return dp[left][right];

        int ans;
        if(aTurn){
            int takeLeft = piles[left] + helper(left+1, right, !aTurn, piles);
            int takeRight = piles[right] + helper(left, right-1, !aTurn, piles);
            ans = Math.max(takeLeft, takeRight);
        }
        else{
            int takeLeft = - piles[left] + helper(left+1, right, !aTurn, piles);
            int takeRight = - piles[right] + helper(left, right-1, !aTurn, piles);
            ans = Math.min(takeLeft, takeRight);
        }

        return dp[left][right] = ans;
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        dp = new Integer[n][n];

        return helper(0, n-1, true, piles) > 0;
    }
}