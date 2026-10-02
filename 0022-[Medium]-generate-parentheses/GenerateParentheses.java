class Solution {
    static List<String> ans;
    public void print(int open , int close , int n , String str){
        if(str.length() == 2*n){
            ans.add(str);
            return;
        }
        if(open < n) print(open+1 , close , n , str+"(");
        if(close < open) print(open , close+1 , n , str+")");
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        print(0 , 0 , n , "");
        return ans;
    }
}