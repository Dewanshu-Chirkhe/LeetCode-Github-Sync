class Solution {
    public int dist(int a, int b){
        int diff = Math.abs(a - b);
        return Math.min(diff, 10-diff);
    }
    public int minRotations(int n, String s) {
        int original = 0;
        int prev = 0;

        for(int i=0 ; i<n ; i++){
            int curr = s.charAt(i) - '0';
            original += dist(prev, curr);
            prev = curr;
        }

        int ans = original;

        for(int k=0 ; k<n ; k++){
            int before = (k == 0) ? 0 : s.charAt(k-1) - '0';
            int first = s.charAt(k) - '0';
            int last = s.charAt(n-1) - '0';

            int newCost = original - dist(before, first) + dist(before, last);

            ans = Math.min(ans, newCost);
        }
        
        return ans;
    }
}