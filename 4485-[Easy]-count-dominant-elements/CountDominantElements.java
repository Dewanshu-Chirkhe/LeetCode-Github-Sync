class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int ans = 0;
        if(nums[0] >= nums[1]) ans++;
        if(nums[n-1] >= nums[n-2]) ans++;

        for(int i=1 ; i<n-1 ; i++){
            if ((long) nums[i] * 2 >= (long) nums[i - 1] + nums[i + 1]) {
                ans++;
            }
        }

        return ans;
    }
}