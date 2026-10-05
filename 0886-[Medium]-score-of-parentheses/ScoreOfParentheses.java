class Solution {
    public int scoreOfParentheses(String s) {
        return solve(s, 0, s.length()-1);
    }
    public int solve(String s, int l, int r){
        int start = l;
        int score = 0;

        for(int i=l ; i<=r ; i++){
            if(s.charAt(i) == '('){
                int count = 1;

                for(int j=i+1 ; j<=r ; j++){
                    if(s.charAt(j) == '(') count++;
                    else count--;

                    if(count == 0){
                        if(j == i+1) score += 1;
                        else score += 2 * solve(s, i+1, j-1);

                        i = j;
                        break;
                    }
                }
            }
    
        }

        return score;
    }
}