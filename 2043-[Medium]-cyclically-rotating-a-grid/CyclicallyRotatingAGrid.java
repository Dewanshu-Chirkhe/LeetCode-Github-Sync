class Solution {
    public void rotate(int[][] grid, int k, int[] topLeft, int[] bottomRight){
        int top = topLeft[0];
        int left = topLeft[1];
        int bottom = bottomRight[0];
        int right = bottomRight[1];

        List<Integer> list = new ArrayList<>();

        // top row
        for(int j=left ; j<=right ; j++) list.add(grid[top][j]);
        // right column
        for(int i=top+1 ; i<=bottom-1 ; i++) list.add(grid[i][right]);
        // bottom row
        for(int j=right ; j>=left ; j--) list.add(grid[bottom][j]);
        // left column
        for(int i=bottom-1 ; i>= top+1 ; i--) list.add(grid[i][left]);

        int size = list.size();
        k %= size;

        int idx = 0;

        // top row
        for(int j = left; j <= right; j++){
            grid[top][j] = list.get((idx + k) % size);
            idx++;
        }

        // right column
        for(int i = top + 1; i <= bottom - 1; i++){
            grid[i][right] = list.get((idx + k) % size);
            idx++;
        }

        // bottom row
        for(int j = right; j >= left; j--){
            grid[bottom][j] = list.get((idx + k) % size);
            idx++;
        }

        // left column
        for(int i = bottom - 1; i >= top + 1; i--){
            grid[i][left] = list.get((idx + k) % size);
            idx++;
        }
    }
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;
        int[] topLeft = {0, 0};
        int[] bottomRight = {m-1, n-1};

        while(layers-- > 0){
            rotate(grid, k, topLeft, bottomRight);
            topLeft[0] += 1;
            topLeft[1] += 1;
            bottomRight[0] -= 1;
            bottomRight[1] -= 1;
        }

        return grid;
    }
}