class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);

        long sum = 0;
        int idx = n - 1;
        for(int i=0 ; i < k ; i++){
            long product = (long)nums[idx] * mul;
            if(mul >= 1) sum += product;
            else sum += nums[idx];
            idx--;
            mul--;
        }

        return sum;
    }
}