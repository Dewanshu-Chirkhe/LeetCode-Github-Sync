class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        
        for(int i=0 ; i<n ; i++){
            long sum = 0;

            boolean[] seen = new boolean[k];
            for(int j=i ; j<n ; j++){
                sum += nums[j];

                int x = nums[j] % k;
                if(x < 0) x += k;

                int twice = (2 * x) % k;
                seen[twice] = true;

                int rem = (int) sum % k;
                if(rem < 0) rem += k;

                if(rem == 0 || seen[rem]) ans = Math.max(ans, (j-i+1));
            }
        }

        return ans;
    }
}