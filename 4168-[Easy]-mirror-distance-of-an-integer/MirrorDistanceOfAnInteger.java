class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num != 0){
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {

        return Math.abs(n - reverse(n));
    }
}