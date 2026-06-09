class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int ele : nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }

        return (max - min) * k;
    }
}