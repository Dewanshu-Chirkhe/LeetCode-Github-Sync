class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            int ele = nums[i];
            map.putIfAbsent(ele, new ArrayList<>());
            map.get(ele).add(i);
        }

        int ans = 0;
        for(int key : map.keySet()){
            List<Integer> list = map.get(key);
            int size = list.size();

            if(size < 3) continue;

            int diff = list.get(1) - list.get(0);
            boolean possible = true;
            for(int i=2 ; i<size ; i++){
                if(list.get(i) - list.get(i-1) != diff){
                    possible = false;
                    break;
                }
            }

            if(possible) ans++;
        }

        return ans;
    }
}