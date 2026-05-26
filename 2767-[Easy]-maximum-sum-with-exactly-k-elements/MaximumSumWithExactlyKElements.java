class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int sum = 0;
        for(int i=0 ; i<k ; i++){
            int temp = nums[n-1];
            sum += nums[n-1];
            nums[n-1] = temp+1;
        }

        return sum;
    }
}