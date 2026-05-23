class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;
        
        for(int ele : nums){
            if(ele == 0) zeroCount++;
        }

        int zeroEnd = 0;
        int temp = zeroCount;
        int idx = n-1;
        
        while(temp != 0){
            if(nums[idx] == 0) zeroEnd++;
            temp--;
            idx--;
        }

        return zeroCount - zeroEnd;
    }
}