class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int mid = nums[n/2];

        for(int i=0 ; i<n ; i++){
            if(nums[i] == mid && i != n/2) return false;
        }
        return true;
    }
}