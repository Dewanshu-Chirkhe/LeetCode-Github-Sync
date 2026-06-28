class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        int n = occupiedIntervals.length;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(occupiedIntervals[0]);
        
        for(int i=0 ; i<n ; i++){
            int start = occupiedIntervals[i][0];
            int end = occupiedIntervals[i][1];
            int[] last = merged.get(merged.size() - 1);

            if(start <= last[1] + 1) last[1] = Math.max(last[1], end);
            else merged.add(occupiedIntervals[i]);
        }

        for(int[] interval : merged){
            int s = interval[0];
            int e = interval[1];

            if(e < freeStart || s > freeEnd){
                list.add(Arrays.asList(s, e));
                continue;
            }
            if(s < freeStart) list.add(Arrays.asList(s, freeStart - 1));
            if(e > freeEnd) list.add(Arrays.asList(freeEnd + 1, e));
        }
        
        return list;
    }
}