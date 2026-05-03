class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            int mod = ele % 2;
            int parity =  0;
            
            for(int j=i+1 ; j<n ; j++){
                if(nums[j] % 2 != mod) parity++;
            }
            
            ans[i] = parity;
        }

        return ans;
    }
}