class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        int f = 0;
        for(int i=0 ; i<n ; i++){
            totalSum += nums[i];
            f += i * nums[i];
        }

        int max = f;
        for(int i=n-1 ; i>0 ; i--){
            f = f + totalSum - n * nums[i];
            max = Math.max(max, f);
        }

        return max;
    }
}