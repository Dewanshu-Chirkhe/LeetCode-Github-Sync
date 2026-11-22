class Solution {
    public boolean checkString(String s) {
        boolean startedB = false;
        for(char ch : s.toCharArray()){
            if(ch == 'a' && startedB) return false;
            else if(ch == 'b') startedB = true;
        }

        return true;
    }
}