class Solution {
    public int reverse(int n){
        int reverse = 0;
        while(n != 0){
            reverse *= 10;
            int last = n % 10;
            n /= 10;
            reverse += last;
        }
        return reverse;
    }

    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i=3 ; i*i<=n ; i+=2){
            if(n % i == 0) return false;
        }
        
        return true;
    }

    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);

        int count = 0;
        for(int i=Math.min(n, r) ; i<=Math.max(n, r) ; i++){
            if(isPrime(i)) count += i;
        }

        return count;
    }
}