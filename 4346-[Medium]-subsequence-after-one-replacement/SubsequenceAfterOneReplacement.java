class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length();

        int noReplace = 0;
        int oneReplace = 0;

        for(char ch : t.toCharArray()){
            int prevNoReplace = noReplace;
            int prevOneReplace = oneReplace;

            if(prevOneReplace < n && s.charAt(prevOneReplace) == ch){
                oneReplace = prevOneReplace + 1;
            }

            if(prevNoReplace < n){
                oneReplace = Math.max(oneReplace, prevNoReplace + 1);
            }

            if(prevNoReplace < n && s.charAt(prevNoReplace) == ch){
                noReplace = prevNoReplace + 1;
            }
        }

        return noReplace == n || oneReplace == n;
    }
}