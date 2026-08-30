class Solution {
    public static int MOD = 1_000_000_007;

    public long power(long x, long y){
        long result = 1;

        while(y > 0){
            if(y % 2 == 1){
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }

        return result;
    }
    
    public int sumDecoded(long[] nums) {
        int n = nums.length;
        long ans = 0;
        
        for(int i=0 ; i<n ; i++){
            long ele = nums[i];
            int width = (int)(ele % 10);
            long d = ele / 10;

            int digits = 0;
            long temp = d;
            while(temp > 0){
                digits++;
                temp /= 10;
            }

            int yDigits = digits - width;

            long divisor = 1;
            for(int j=0 ; j<yDigits ; j++){
                divisor *= 10;
            }

            long x = d / divisor;
            long y = d % divisor;

            ans = (ans + power(x, y)) % MOD;
        }

        return (int)ans;
    }
}