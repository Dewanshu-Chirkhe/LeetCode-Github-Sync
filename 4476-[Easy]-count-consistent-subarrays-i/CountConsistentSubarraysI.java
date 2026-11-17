class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0 ; i<n ; i++){
            int bitAnd = nums[i];
            int minVal = nums[i];
            for(int j=i ; j<n ; j++){
                bitAnd &= nums[j];

                if(nums[j] < minVal) minVal = nums[j];

                if(bitAnd == minVal) count++;
            }
        }

        return count;
    }
}