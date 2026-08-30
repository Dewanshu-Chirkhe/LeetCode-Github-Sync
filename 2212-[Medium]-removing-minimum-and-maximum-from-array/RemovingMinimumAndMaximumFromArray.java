class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minEle = Integer.MAX_VALUE, minIdx = -1;
        int maxEle = Integer.MIN_VALUE, maxIdx = -1;

        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            if(ele < minEle){
                minEle = ele;
                minIdx = i;
            }
            if(ele > maxEle){
                maxEle = ele;
                maxIdx = i;
            }
        }

        if(minIdx > maxIdx){
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        int front = maxIdx + 1;
        int back = n - minIdx;
        int both = (minIdx + 1) + (n - maxIdx);

        return Math.min(front, Math.min(back, both));
    }
}