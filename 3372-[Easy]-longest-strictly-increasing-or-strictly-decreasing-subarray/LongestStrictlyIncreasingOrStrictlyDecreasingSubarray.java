class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int maxInc = 1;
        for(int i=0 ; i<n ; i++){
            int curr = nums[i];
            int inc = 1;
            for(int j=i+1 ; j<n ; j++){
                int next = nums[j];
                if(next > curr) inc++;
                else inc = 1;
                curr = next;
                maxInc = Math.max(maxInc, inc);
            }
        }

        int maxDec = 1;
        for(int i=n-1 ; i>=0 ; i--){
            int curr = nums[i];
            int dec = 1;
            for(int j=i-1 ; j>=0 ; j--){
                int prev = nums[j];
                if(prev > curr) dec++;
                else dec = 1;
                curr = prev;
                maxDec = Math.max(maxDec, dec);
            }
        }

        return Math.max(maxInc, maxDec);
    }
}