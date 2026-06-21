class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);
        
        int count = 0;
        long price = 0;
        for(int i=0 ; i<n ; i++){
            if(price + costs[i] <= coins){
                count++;
                price += costs[i];
            }
            else break;
        }

        return count;
    }
}