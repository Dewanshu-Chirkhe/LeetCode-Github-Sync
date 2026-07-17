class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pInteger = new ArrayList<>();
        List<Integer> nInteger = new ArrayList<>();
        for(int ele : nums){
            if(ele < 0) nInteger.add(ele);
            else pInteger.add(ele);
        }

        int pIdx = 0;
        int nIdx = 0;
        for(int i=0 ; i<n ; i++){
            if(i % 2 == 0) nums[i] = pInteger.get(pIdx++);
            else nums[i] = nInteger.get(nIdx++);
        }

        return nums;
    }
}