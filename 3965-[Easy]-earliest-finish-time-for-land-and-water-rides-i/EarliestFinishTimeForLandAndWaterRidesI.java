class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m = landStartTime.length;
        int n = waterStartTime.length;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int finish1 = waterStart + waterDuration[j];
                
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }

        return ans;
    }
}