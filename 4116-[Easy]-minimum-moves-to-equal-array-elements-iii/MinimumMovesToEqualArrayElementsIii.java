class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int ele : nums) max = Math.max(max, ele);

        int ans = 0;
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            if(ele == max) continue;
            else ans += Math.abs(ele - max);
        }

        return ans;
    }
}