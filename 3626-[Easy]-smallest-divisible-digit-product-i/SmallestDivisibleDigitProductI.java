class Solution {
    public boolean isPossible(int ele, int t){
        int product = 1;
        while(ele > 0){
            product *= ele % 10;
            ele /= 10;
        }
        if(product % t == 0) return true;
        else return false;
    }
    public int smallestNumber(int n, int t) {
        while(!isPossible(n, t)) n++;
        return n;
    }
}