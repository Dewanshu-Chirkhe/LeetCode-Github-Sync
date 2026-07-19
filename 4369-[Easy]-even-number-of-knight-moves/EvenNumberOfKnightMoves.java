class Solution {
    public boolean canReach(int[] start, int[] target) {
        int diff = Math.abs(start[0] - target[0]) + Math.abs(start[1] - target[1]);

        return diff % 2 == 0;
    }
}