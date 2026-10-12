class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};
        int maxProd = Integer.MIN_VALUE;
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(i == j) continue;
                if(nums[i] > nums[j] && nums[i] + nums[j] == target){
                    int prod = nums[i] * nums[j];
                    if(prod > maxProd){
                        maxProd = prod;
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        
        return ans;
    }
}