class Solution {
    public int countDigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public int countCommas(int n) {
        if(n <= 999) return 0;
        int count = 0;
        for(int i=1000 ; i<=n ; i++){
            int digitCount = countDigit(n);
            count += (digitCount - 1) / 3;
        }
        return count;
    }
}