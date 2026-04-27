class Solution {
    int[][] dirs = {{0, 1}, {1, 0}};
    Boolean[][][] dp;

    public boolean compute(int i, int j, char[][] grid, int sum){
        int m = grid.length;
        int n = grid[0].length;
        
        if(i >= m || j >= n) return false;

        char ch = grid[i][j];
        int change = (ch == '(') ? 1 : -1;
        sum += change;

        if(sum < 0) return false;

        if(i == m-1 && j == n-1){
            if(sum == 0) return true;
            else return false;
        }

        if(dp[i][j][sum] != null) return dp[i][j][sum];

        for(int[] dir : dirs){
            int ni = i + dir[0];
            int nj = j + dir[1];
            if(compute(ni, nj, grid, sum)) return true;
        }

        return dp[i][j][sum] = false;
    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0] == ')') return false;
        dp = new Boolean[m][n][m+n+1];

        return compute(0, 0, grid, 0);
    }
}