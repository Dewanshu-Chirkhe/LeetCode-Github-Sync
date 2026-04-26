class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        List<Integer> ans = new ArrayList<>();
        if(n == 1){
            ans.add(nums[0]);
            return ans;
        }

        leftMax[0] = Integer.MIN_VALUE;
        rightMax[n-1] = Integer.MIN_VALUE;

        for(int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], nums[i-1]);
        }
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], nums[i+1]);
        }

        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            if(ele > leftMax[i] || ele > rightMax[i]){
                ans.add(ele);
            }
        }
        
        return ans;
    }
}