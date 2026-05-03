class Solution {
    public int calculateCost(int left, int right, long[] forward, long[] backward){
        if(left < right) return (int)(forward[right] - forward[left]);
        else return (int)(backward[right] - backward[left]);
    }
    
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] closest = new int[n];
        for(int i=0 ; i<n ; i++){
            if(i == 0) closest[i] = 1;
            else if(i == n-1) closest[i] = n-2;
            else{
                int leftDiff = nums[i] - nums[i-1];
                int rightDiff = nums[i+1] - nums[i];

                if(leftDiff <= rightDiff) closest[i] = i-1;
                else closest[i] = i+1;
            }
        }

        long[] forward = new long[n];
        long[] backward = new long[n];

        for(int i=1 ; i<n ; i++){
            if(closest[i-1] == i) forward[i] = forward[i-1] + 1;
            else forward[i] = forward[i-1] + (nums[i] - nums[i-1]);
        }

        for(int i=n-2 ; i>=0 ; i--){
            if(closest[i+1] == i) backward[i] = backward[i+1] + 1;
            else backward[i] = backward[i+1] + (nums[i+1] - nums[i]);
        }
        
        int q = queries.length;
        int[] ans = new int[q];
        for(int i=0 ; i<q ; i++){
            int left = queries[i][0];
            int right = queries[i][1];

            ans[i] = calculateCost(left, right, forward, backward);
        }
        
        return ans;
    }
}