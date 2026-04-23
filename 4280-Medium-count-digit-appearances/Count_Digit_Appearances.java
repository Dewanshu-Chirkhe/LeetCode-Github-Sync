class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            while(ele != 0){
                int last = ele % 10;
                ele /= 10;
                if(last == digit) count++;
            }
        }
        return count;
    }
}