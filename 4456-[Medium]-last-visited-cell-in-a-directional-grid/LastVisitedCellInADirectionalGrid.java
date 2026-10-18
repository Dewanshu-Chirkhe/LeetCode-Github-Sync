class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int i=0, j=0;
        visited[i][j] = true;

        while(true){
            char move = grid[i][j];
            int ni = i, nj = j;

            if(move == 'L') nj--;
            else if(move == 'R') nj++;
            else if(move == 'U') ni--;
            else if(move == 'D') ni++;

            if(ni < 0 || ni >= m || nj < 0 || nj >= n) break;

            if(visited[ni][nj]) break;

            i = ni;
            j = nj;
            visited[i][j] = true;
        }
        
        
        return new int[]{i, j};
    }
}