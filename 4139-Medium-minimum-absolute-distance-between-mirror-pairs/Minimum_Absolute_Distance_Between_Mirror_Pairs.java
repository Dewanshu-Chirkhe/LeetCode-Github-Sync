class Solution {
    private int reverse(int ele) {
        int rev = 0;
        while (ele != 0) {
            int last = ele % 10;
            ele = ele / 10;
            rev *= 10;
            rev += last;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(); 
        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                minDis = Math.min(minDis, i - j);
            }
            int rev = reverse(nums[i]);
            map.put(rev, i);
        }

        if (minDis == Integer.MAX_VALUE) return -1;
        else return minDis;
    }
}