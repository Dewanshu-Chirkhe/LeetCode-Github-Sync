class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();

        for(int i=0 ; i<n-1 ; i++){
            int curr = s.charAt(i) - '0';
            int next = s.charAt(i+1) - '0';

            int diff = Math.abs(curr - next);

            if(diff > 2) return false;
        }

        return true;
    }
}