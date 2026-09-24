class Solution {
    public int getSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;

        for(int i=0 ; i<n ; i++){
            if(getSum(nums[i]) == i){
                ans = i;
                break;
            }
        }

        return ans;
    }
}