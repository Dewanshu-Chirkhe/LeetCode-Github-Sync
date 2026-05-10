class Solution {
    public long minArraySum(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int ele : nums) set.add(ele);

        long sum = 0;
    
        for(int x : nums){
            int best = x;

            for(int d = 1 ; d*d <= x ; d++){
                if(x % d == 0){
                    int d1 = d;
                    int d2 = x / d;

                    if(set.contains(d1)) best = Math.min(best, d1);

                    if(set.contains(d2)) best = Math.min(best, d2);
                }
            }
            
            sum += best;
        }
        
        return sum;
    }
}