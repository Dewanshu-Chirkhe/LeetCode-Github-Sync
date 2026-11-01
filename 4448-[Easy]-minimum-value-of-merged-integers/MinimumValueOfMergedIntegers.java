class Solution {
    public int minMergedInteger(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i=0 ; i<n ; i+=2){
            int curr = nums[i];
            int next = nums[i+1];

            int len = 0;
            while(next > 0){
                len++;
                next /= 10;
            }

            for(int j=0 ; j<len ; j++) curr *= 10;

            curr += nums[i+1];
            ans = Math.min(ans, curr);
        }

        return ans;
    }
}