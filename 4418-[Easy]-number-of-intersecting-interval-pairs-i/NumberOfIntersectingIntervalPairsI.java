class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int[] a = intervals[i];
                int[] b = intervals[j];

                if(a[1] >= b[0] && b[1] >= a[0]){
                    count++;
                }
            }
        }

        return count;
    }
}