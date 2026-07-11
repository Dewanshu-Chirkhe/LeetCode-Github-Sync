class Solution {
    public int maxPower(String s) {
        int n = s.length();
        char prev = s.charAt(0);
        int len = 1;
        int maxLen = 1;

        for(int i=1 ; i<n ; i++){
            char curr = s.charAt(i);
            if(prev == curr) len++;
            else len = 1;
            prev = curr;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}