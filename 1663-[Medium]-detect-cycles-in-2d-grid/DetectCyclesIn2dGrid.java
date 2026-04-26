class Solution {
    boolean[][] visited;
    int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public boolean bfs(char[][] grid, int i, int j, boolean[][] visited){
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{i, j, -1, -1}); // starting index with parent -1 and -1;
        visited[i][j] = true; // mark as visited

        while(!que.isEmpty()){
            int[] curr = que.poll();
            int x = curr[0], y = curr[1];
            int px = curr[2], py = curr[3];

            for(int[] d : dirs){
                int nx = x + d[0];
                int ny = y + d[1];

                if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if(grid[x][y] != grid[nx][ny]) continue;

                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    que.offer(new int[]{nx, ny, x, y});
                }
                else if(nx != px || ny != py) return true;
            }
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
                    if(bfs(grid, i, j, visited)) return true;
                }
            }
        }

        return false;
    }
}