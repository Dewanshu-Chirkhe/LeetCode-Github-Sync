class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int ele : candyType) set.add(ele);
        int count = candyType.length / 2;
        return Math.min(set.size(), count);
    }
}