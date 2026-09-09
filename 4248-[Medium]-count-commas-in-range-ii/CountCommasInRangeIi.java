class Solution {
    public int countDigit(long num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public long countCommas(long n) {
        if(n <= 999) return 0;

        int digits = countDigit(n);
        long count = 0;
        long start = 1000;
        for(int d=4 ; start <= n ; d++){
            long end = Math.min(n , start * 10 - 1);
            long numbers = end - start + 1;
            count += numbers * ((d-1) / 3);
            start *= 10;
        }
        return count;
    }
}