class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i=0 ; i<n-1 ; i++){
            int ele = nums[i];
            int same = 1;
            while(i < n-1 && nums[i] == nums[i+1]){
                same++;
                i++;
            }
            ans += (same - 1);
        }
        
        return ans;
    }
}