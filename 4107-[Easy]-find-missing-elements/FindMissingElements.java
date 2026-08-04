class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        
        for(int ele : nums){
            min = Math.min(min , ele);
            max = Math.max(max , ele);
            set.add(ele);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=min ; i<=max ; i++){
            if(set.contains(i)) continue;
            else ans.add(i);
        }

        return ans;
    }
}