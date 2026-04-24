class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<queries.length ; i++){
            int currIdx = queries[i];
            int ele = nums[queries[i]];

            List<Integer> indices = map.get(ele);

            if(indices.size() < 2) list.add(-1);
            else{
                int pos = Collections.binarySearch(indices, currIdx);

                int size = indices.size();
                int minDist = Integer.MAX_VALUE;

                //next index (right)
                int next = indices.get((pos + 1) % size);
                int d1 = Math.abs(next - currIdx);
                minDist = Math.min(minDist, Math.min(d1, n-d1));

                //prev index (left)
                int prev = indices.get((pos - 1 + size) % size);
                int d2 = Math.abs(prev - currIdx);
                minDist = Math.min(minDist, Math.min(d2, n-d2));

                list.add(minDist);
            }
        }

        return list;
    }
}