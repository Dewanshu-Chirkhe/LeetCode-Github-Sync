class Solution {
    public long maxRatings(int[][] units) {
        int m = units.length;
        for(int i=0 ; i<m ; i++) Arrays.sort(units[i]);

        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<m ; i++) min = Math.min(min, units[i][0]);

        long totalValue = 0;
        long minLoss = Long.MAX_VALUE;
        for(int i=0 ; i<m ; i++){
            long val = 0;
            if(units[i].length > 1) val = units[i][1];
            else val = units[i][0];

            totalValue += val;
            minLoss = Math.min(minLoss, val - min);
        }

        return totalValue - minLoss;
    }
}