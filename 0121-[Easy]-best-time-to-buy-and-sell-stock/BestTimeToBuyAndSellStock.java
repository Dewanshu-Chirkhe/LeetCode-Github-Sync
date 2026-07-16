class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int profit = 0;
        int cost = prices[0];
        for(int i=1 ; i<n ; i++){
            if(prices[i] > cost){
                profit = Math.max(profit, (prices[i] - cost));
            }
            else cost = prices[i];
        }
    
        return profit;
    }
}