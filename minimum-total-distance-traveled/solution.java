class Solution {
    public long helper(List<Integer> robot, int[][] factory, int i, int j, Long[][] dp){
        int n = robot.size();
        int m = factory.length;

        if(i == n) return 0;
        if(j == m) return Long.MAX_VALUE;

        if(dp[i][j] != null) return dp[i][j];

        long res = Long.MAX_VALUE;
        //skip
        long skip = helper(robot, factory, i, j+1, dp);
        //not skip
        long dist = 0;
        for(int k=0 ; k<factory[j][1] && i+k < n ; k++){
            dist += Math.abs(robot.get(i+k) - factory[j][0]);
            long next = helper(robot, factory, i+k+1, j+1, dp);
            if(next != Long.MAX_VALUE){
                res = Math.min(res, dist+next);
            }
        }
        res = Math.min(res, skip);
        dp[i][j] = res;
        return dp[i][j];
    }
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory , (a, b) -> a[0] - b[0]);
        int n = robot.size(), m = factory.length;
        Long[][] dp = new Long[n][m];

        //helper(robot, factory, robot idx, fatory idx)
        return helper(robot, factory, 0, 0, dp);
    }
}