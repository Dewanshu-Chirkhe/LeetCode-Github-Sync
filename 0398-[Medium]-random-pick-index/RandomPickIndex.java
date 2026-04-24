class Solution {
    Map<Integer, List<Integer>> map;
    public Solution(int[] nums) {
        map = new HashMap<>();
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            map.putIfAbsent(ele, new ArrayList<>());
            map.get(ele).add(i);
        }
    }
    
    public int pick(int target) {
        int size = map.get(target).size() - 1;
        int randomIdx = (int)(Math.random() * ((size - 0) + 1) + 0);
        return map.get(target).get(randomIdx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */