class Solution {
    public int minimumCost(int[] nums, int k) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        long resource = k;
        long opCount = 0;
        long cost = 0;

        for(int i=0 ; i<n ; i++){
            if(resource < nums[i]){
                long need = (nums[i] - resource + k - 1) / k;

                long first = (opCount + 1) % MOD;
                long last = (opCount + need) % MOD;
                long need2 = need % MOD;
                long inv2 = 500_000_004L;
                long add = (((first + last) % MOD) * need2) % MOD;
                add = (add * inv2) % MOD;

                cost = (cost + add) % MOD;
                opCount += need;
                resource += need * (long)k;
            }
            resource -= nums[i];
        }

        return (int)cost;
    }
}