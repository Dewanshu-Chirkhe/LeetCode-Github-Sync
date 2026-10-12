class Solution {
    public void findPrime(boolean[] isPrime){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;

        if(isPrime.length > 1) isPrime[1] = false;

        for(int i=2 ; i*i < isPrime.length ; i++){
            if(isPrime[i]){
                for(int j=i*i ; j<isPrime.length ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> list = new ArrayList<>();

        if(n < 2 || s < 2) return list;
        
        boolean[] isPrime = new boolean[n+1];
        findPrime(isPrime);

        int sum = 0;

        for(int i=2 ; i<=n ; i++){
            if(isPrime[i]){
                if(sum + i > s) break;
                
                list.add(i);
                sum += i;
            }
        }
        
        return list;
    }
}