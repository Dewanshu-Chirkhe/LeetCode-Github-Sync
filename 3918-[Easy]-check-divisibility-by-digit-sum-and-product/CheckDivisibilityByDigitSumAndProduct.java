class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num = n;
 
        while(num != 0){
            int last = num % 10;
            num /= 10;
            sum += last;
            product *= last;
        }

        if(n % (sum + product) == 0) return true;
        return false;
    }
}