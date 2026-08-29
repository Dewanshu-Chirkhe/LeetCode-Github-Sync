class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        
        int leftSum = 0, leftQ = 0;
        int rightSum = 0, rightQ = 0;

        for(int i=0 ; i<(n/2) ; i++){
            if(num.charAt(i) == '?') leftQ++;
            else leftSum += num.charAt(i) - '0';

            if(num.charAt(n-i-1) == '?') rightQ++;
            else rightSum += num.charAt(n-i-1) - '0';
        }

        int sumDiff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        if(qDiff % 2 == 0 && sumDiff == -9 * (qDiff / 2)) return false;
        else return true;
    }
}