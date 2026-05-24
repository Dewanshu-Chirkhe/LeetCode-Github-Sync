class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            int freq = map.get(key);
            for(int i=0 ; i<Math.min(freq, k) ; i++){
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            ans[i] = list.get(i);
        }

        Arrays.sort(ans);

        return ans;
    }
}