class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        int opencount = 0;
        for(int i=0 ; i< n ; i++){
            char c = s.charAt(i);
            if(c == '('){
                if(opencount > 0) sb.append(c);
                opencount++;
            }
            else{
                opencount--;
                if(opencount > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}