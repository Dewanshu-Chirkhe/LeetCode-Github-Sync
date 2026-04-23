class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;

        for (List<Integer> list : map.values()) {
            if (list.size() < 3) continue;
            for (int i = 0; i + 2 < list.size(); i++) {
                int first = list.get(i);
                int third = list.get(i + 2);
                ans = Math.min(ans, 2 * (third - first));
            }
        }

        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}