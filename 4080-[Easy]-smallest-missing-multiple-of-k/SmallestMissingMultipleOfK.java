class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);

        int i = 1;
        int multiple = k;
        while(true){
            multiple = k * i;
            i++;
            if(!set.contains(multiple)) break;
        }

        return multiple;
    }
}