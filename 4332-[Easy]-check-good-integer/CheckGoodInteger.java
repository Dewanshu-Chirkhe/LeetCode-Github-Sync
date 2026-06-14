class Solution {
    public long digitSum(int n){
        long sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public long squareSum(int n){
        long sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += (rem * rem);
            n /= 10;
        }
        return sum;
    }
    public boolean checkGoodInteger(int n) {
        long dSum = digitSum(n);
        long sSum = squareSum(n);

        if(sSum - dSum >= 50) return true;
        else return false;
    }
}