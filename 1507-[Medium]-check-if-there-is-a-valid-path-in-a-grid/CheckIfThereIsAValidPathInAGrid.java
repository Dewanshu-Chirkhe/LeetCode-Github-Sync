class Solution {
    boolean[][] visited;
    int[][] dirs = {{}, 
                    {0, -1, 0, 1},
                    {-1, 0, 1, 0},
                    {0, -1, 1, 0},
                    {0, 1, 1, 0},
                    {0, -1, -1, 0},
                    {0, 1, -1, 0}};
    
    public boolean dfs(int i, int j, int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || j < 0 || i >= m || j >= n || visited[i][j]) return false;
        if(i == m-1 && j == n-1) return true;
        
        visited[i][j] = true;

        int ele = grid[i][j];
        int[] dir = dirs[ele];
        
        for(int k=0 ; k<4 ; k+=2){
            int x = i + dir[k];
            int y = j + dir[k+1];

            if(x < 0 || y < 0 || x >= m || y >= n) continue;

            int next = grid[x][y];
            int[] nextDir = dirs[next];

            boolean valid = false;
            for(int t=0 ; t<4 ; t+=2){
                if(x + nextDir[t] == i && y + nextDir[t+1] == j){
                    valid = true;
                    break;
                }
            }

            if(valid && dfs(x, y, grid)) return true;
        }

        return false;
    }
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        return dfs(0, 0, grid);
    }
}