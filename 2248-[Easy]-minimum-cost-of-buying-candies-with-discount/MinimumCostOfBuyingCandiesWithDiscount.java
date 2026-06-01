class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int minCost = 0;
        int candies = 0;

        for(int i=n-1 ; i>=0 ; i--){
            candies++;
            if(candies == 3){
                candies = 0;
                continue;
            }
            minCost += cost[i];
        }

        return minCost;
    }
}