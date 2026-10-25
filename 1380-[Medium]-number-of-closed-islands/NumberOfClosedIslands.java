class Solution {
    public boolean isClosed(int x, int y, int m, int n, int[][]grid, boolean[][] visited){
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x, y});
        visited[x][y] = true;
        boolean isClosed = true;

        int[] dirx = {0, 1, 0, -1};
        int[] diry = {-1, 0, 1, 0};

        while(!que.isEmpty()){
            int[] temp = que.poll();
            x = temp[0];
            y = temp[1];

            for(int i=0 ; i<4 ; i++){
                int r = x + dirx[i];
                int c = y + diry[i];
                if(r < 0 || r >= m || c < 0 || c >= n) isClosed = false;
                else if(grid[r][c] == 0 && !visited[r][c]){
                    que.offer(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
        }

        return isClosed;
    }
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int islands = 0;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j] == 0 && !visited[i][j] && isClosed(i, j, m, n, grid, visited)){
                    islands++;
                }
            }
        }

        return islands;
    }
}