class Solution {
    public boolean rotateString(String str, String goal) {

        // if(str.length() != goal.length()) return false;      //BruteForce(Accepted)
        // if(str.length() == 0 && goal.length() == 0) return true;
        // char[] ch = str.toCharArray();
        // int n = ch.length;
        // for(int i=0 ; i<n ; i++){
        //     char first = ch[0];
        //     for(int j=1 ; j<n ; j++){
        //         ch[j-1] = ch[j];
        //     }
        //     ch[n-1] = first;
        //     String temp = new String(ch);
        //     if(goal.equals(temp)){
        //         return true;
        //     }
        // }
        // return false;

        if(str.length() != goal.length()) return false;
        String temp = str + str;
        if(temp.contains(goal)) return true;
        else return false;
    }
}