class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);

        List<List<Integer>> ans = new ArrayList<>();

        int ele = lower;

        while(ele <= upper){
            if(!set.contains(ele)){
                int start = ele;
                int end = ele;
                
                while(ele<=upper && !set.contains(ele)){
                    end = ele;
                    ele++;
                }

                ans.add(new ArrayList<>(List.of(start, end)));
            }
            else ele++;
        }

        return ans;
    }
}