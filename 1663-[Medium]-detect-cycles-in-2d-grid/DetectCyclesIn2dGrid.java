class Solution {
    boolean[][] visited;
    int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public boolean dfs(char[][] grid, int x, int y, int px, int py){
        int m = grid.length;
        int n = grid[0].length;
        visited[x][y] = true; // mark as visited

        for(int[] d : dirs){
            int nx = x + d[0];
            int ny = y + d[1];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if(grid[nx][ny] != grid[x][y]) continue;

            if(!visited[nx][ny]){
                if(dfs(grid, nx, ny, x, y)) return true;
            }
            else if(nx != px || ny != py) return true;
        }

        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(!visited[i][j]){
                    if(dfs(grid, i, j, -1, -1)) return true;
                }
            }
        }

        return false;
    }
}