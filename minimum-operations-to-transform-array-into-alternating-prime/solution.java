class Solution {
    public boolean isPrime(int ele){
        if(ele <= 1) return false;
        
        for(int i=2 ; i*i<=ele ; i++){
            if(ele % i == 0) return false;
        }
        return true;
    }
    public int nextPrime(int ele){
        int num = ele;
        while(true){
            if(isPrime(num)) return num;
            num++;
        }
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;
        
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            if(i % 2 == 0){
                if(isPrime(ele)) continue;
                else{
                    int nextPrime = nextPrime(ele);
                    operations += nextPrime - ele;
                }
            }
            else{
                if(!isPrime(ele)) continue;
                else{
                    while(isPrime(ele)){
                        ele++;
                        operations++;
                    }
                }
            }
        }

        return operations;
    }
}