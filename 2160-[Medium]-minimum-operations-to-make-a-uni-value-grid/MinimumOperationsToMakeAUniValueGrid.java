class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();

        for(int[] arr : grid){
            for(int ele : arr){
                if((ele - grid[0][0]) % x != 0) return -1;
                list.add(ele);
            }
        }

        Collections.sort(list);
        int median = list.get(list.size()/2);
        int operations = 0;
        for(int ele : list){
            operations += Math.abs((ele - median) / x);
        }

        return operations;
    }
}