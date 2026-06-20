class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        
        int ans = Math.max(gain[0], 0);
        int prev = gain[0];
        for(int i=1 ; i<n ; i++){
            int alt = gain[i] + prev;
            prev = alt;
            ans = Math.max(ans, alt);
        }

        return ans;
    }
}