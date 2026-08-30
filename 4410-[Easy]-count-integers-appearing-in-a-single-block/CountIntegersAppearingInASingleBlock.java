class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = map.size();
        
        for(List<Integer> list : map.values()){
            for(int i=1 ; i<list.size() ; i++){
                if(list.get(i) != list.get(i-1) + 1){
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}