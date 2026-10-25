class Solution {
    public long rearrange(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        long result = 0;

        for(int i=digits.length-1 ; i>=0 ; i--){
            result = result * 10 + (digits[i] - '0');
        }

        return result;
    }
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;

        long[] gains = new long[n];
        for(int i=0 ; i<n ; i++){
            ans += nums[i];
            gains[i] = rearrange(nums[i]) - nums[i];
        }

        Arrays.sort(gains);

        for(int i=n-1 ; i>=n-k ; i--){
            if(gains[i] <= 0) break;
            ans += gains[i];
        }

        return ans;
    }
}