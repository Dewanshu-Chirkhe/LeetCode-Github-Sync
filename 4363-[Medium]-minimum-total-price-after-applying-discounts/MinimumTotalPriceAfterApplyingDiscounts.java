class Solution {
    public double discount(int price, int discount){
        return (price * (100 - discount)) / 100.0;
    }
    public double minPrice(int[] prices, int[] discounts) {
        int n = prices.length;
        int m = discounts.length;
        
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double total = 0;
        int k = Math.min(n, m);

        for(int i=0 ; i<k ; i++){
            total += discount(prices[n-i-1], discounts[m-i-1]);
        }

        for(int  i=0 ; i<n-k ; i++){
            total += prices[i];
        }

        return total;
    }
}