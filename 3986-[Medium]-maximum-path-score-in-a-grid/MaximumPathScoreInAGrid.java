class Solution {
    public int[] costs = {0, 1, 1};
    public int helper(int i, int j, int cost, int[][] grid, Integer[][][] dp){
        int m = grid.length;
        int n = grid[0].length;

        if(i >= m || j >= n) return Integer.MIN_VALUE;

        int ele = grid[i][j];
        cost -= costs[ele];

        if(cost < 0) return Integer.MIN_VALUE;
        if(i == m-1 && j == n-1) return ele;

        if(dp[i][j][cost] != null) return dp[i][j][cost];

        int right = helper(i, j+1, cost , grid, dp);
        int down = helper(i+1, j, cost , grid, dp);

        int best = Math.max(right, down);
        if(best == Integer.MIN_VALUE) return dp[i][j][cost] = Integer.MIN_VALUE;

        return dp[i][j][cost] = ele + best;
    }
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][][] dp = new Integer[m][n][k+1];
        
        int ans = helper(0, 0, k, grid, dp);
        if(ans == Integer.MIN_VALUE) return -1;
        else return ans;
    }
}