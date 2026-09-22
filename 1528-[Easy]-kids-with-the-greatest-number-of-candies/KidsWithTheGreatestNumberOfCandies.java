class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max = Integer.MIN_VALUE;
        for(int candy : candies) max = Math.max(max, candy);

        List<Boolean> list = new ArrayList<>();

        for(int i=0 ; i<candies.length ; i++){
            if(candies[i] + extra >= max) list.add(true);
            else list.add(false);
        }

        return list;
    }
}