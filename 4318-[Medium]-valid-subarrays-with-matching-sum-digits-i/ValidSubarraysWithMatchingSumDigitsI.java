class Solution {
    public boolean isMatching(long n, int x){
        String s = n + "";
        int len = s.length();
        
        char first = s.charAt(0);
        char last = s.charAt(len - 1);

        if(first - '0' == x && last - '0' == x) return true;
        else return false;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int ans = 0;

        for(int i=0 ; i<n ; i++){
            long sum = 0;
            for(int j=i ; j<n ; j++){
                sum += nums[j];
                if(isMatching(sum, x)) ans++;
            }
        }

        return ans;
    }
}