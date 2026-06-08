class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();
        for(int ele : nums){
            if(ele < pivot) smaller.add(ele);
            else if(ele > pivot) greater.add(ele);
            else pivots.add(ele);
        }

        int[] ans = new int[n];
        int idx = 0;
        for(int ele : smaller) ans[idx++] = ele;
        for(int ele : pivots) ans[idx++] = ele;
        for(int ele : greater) ans[idx++] = ele;

        return ans;
    }
}