class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });

        int n = intervals.length;
        int prevL = intervals[0][0];
        int prevR = intervals[0][1];
        int ans = 1;
        
        for(int i=1 ; i<n ; i++){
            int l = intervals[i][0];
            int r = intervals[i][1];

            if(l >= prevL && r <= prevR) continue;
            else{
                ans++;
                prevL = l;
                prevR = r;
            }
        }

        return ans;
    }
}