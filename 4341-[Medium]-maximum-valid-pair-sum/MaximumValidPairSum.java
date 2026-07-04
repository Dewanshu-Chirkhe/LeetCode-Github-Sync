class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxLeft = nums[0];
        int max = Integer.MIN_VALUE;

        for(int j=k ; j<n ; j++){
            maxLeft = Math.max(maxLeft, nums[j-k]);
            int sum = nums[j] + maxLeft;
            max = Math.max(max, sum);
        }
    
        return max;
    }
}