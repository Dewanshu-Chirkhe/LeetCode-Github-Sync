class Solution {
    public long dfs(int[][] grid, int i, int j, int m, int n){
        long sum = grid[i][j];
        grid[i][j] = 0;
        
        int[] dirs = {-1, 0, 1, 0, -1};
        for(int d=0 ; d<4 ; d++){
            int x = i + dirs[d];
            int y = j + dirs[d+1];

            if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] > 0){
                sum += dfs(grid, x, y, m, n);
            }
        }

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j] > 0 && dfs(grid, i, j, m, n) % k == 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}