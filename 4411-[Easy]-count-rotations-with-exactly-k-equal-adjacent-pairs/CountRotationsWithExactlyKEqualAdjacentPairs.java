class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int ans = 0;

        for(int i=0 ; i<n ; i++){
            int score = 0;
            for(int j=0 ; j<n-1 ; j++){
                char c1 = s.charAt((i+j) % n);
                char c2 = s.charAt((i+j+1) % n);
                if(c1 == c2) score++;
            }
            if(score == k) ans++;
        }

        return ans;
    }
}