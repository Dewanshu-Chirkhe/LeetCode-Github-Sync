class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int[] ans = new int[n];

        for (int num : nums) {
            freq[num]++;
        }

        int idx = 0;

        while (idx < n) {
            for (int num = 1; num <= 100; num++) {
                if (freq[num] > 0) {
                    ans[idx++] = num;
                    freq[num]--;
                }
            }
        }

        return ans;
    }
}