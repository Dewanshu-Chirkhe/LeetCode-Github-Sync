class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;

        int minDiff = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            if(nums[i] == target){
                int diff = Math.abs(i - start);
                minDiff = Math.min(minDiff, diff);
            }
        }

        return minDiff;
    }
}