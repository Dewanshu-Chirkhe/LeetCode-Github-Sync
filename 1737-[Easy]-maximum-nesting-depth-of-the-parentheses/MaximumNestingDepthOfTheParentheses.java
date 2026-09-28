class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxcount = 0;
        int opencount = 0;

        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == '(') opencount++;
            else if (s.charAt(i) == ')') opencount--;
            maxcount = Math.max(maxcount , opencount);
        }
        
        return maxcount;
    }
}