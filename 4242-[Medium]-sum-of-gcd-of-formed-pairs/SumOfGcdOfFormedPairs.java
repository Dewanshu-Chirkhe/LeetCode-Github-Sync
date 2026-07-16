class Solution {
    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        int max = nums[0];
        for(int i=0 ; i<n ; i++){
            max = Math.max(max, nums[i]);
            if(nums[i] == max) prefix[i] = max;
            else prefix[i] = gcd(max, nums[i]);
        }

        Arrays.sort(prefix);

        long ans = 0;
        int i=0, j=n-1;
        while(i < j){
            ans += gcd(prefix[i], prefix[j]);
            i++;
            j--;
        }

        return ans;
    }
}