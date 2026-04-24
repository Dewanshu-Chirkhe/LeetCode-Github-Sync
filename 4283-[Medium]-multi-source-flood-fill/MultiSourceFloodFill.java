class Solution {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public void bfs(int[][] grid, int[][] time, Queue<int[]> q , int n, int m){
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int color = curr[2];

            for(int[] d : dirs){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
                // first visit
                if(time[nr][nc] == -1){
                    grid[nr][nc] = color;
                    time[nr][nc] = time[r][c] + 1;
                    q.offer(new int[]{nr, nc, color});
                }
                // new color with greater value appears
                else if(time[nr][nc] == time[r][c]+1 && grid[nr][nc] < color){
                    grid[nr][nc] = color;
                    q.offer(new int[]{nr, nc, color});
                }
            }
        }
    }
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] grid = new int[n][m];
        int[][] time = new int[n][m];
        
        for(int[] row : time){
            Arrays.fill(row, -1);
        }

        Queue<int[]> q = new LinkedList<>();
        
        for(int[] row : sources){
            int r = row[0];
            int c = row[1];
            int color = row[2];
            grid[r][c] = color;
            time[r][c] = 0;
            q.offer(new int[]{r, c, color});
        }

        bfs(grid, time, q, n, m);
        
        return grid;
    }
}