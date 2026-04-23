class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(colors[i] != colors[j]){
                    int dist = j - i;
                    maxDist = Math.max(maxDist, dist);
                }
            }
        }   
        return maxDist;
    }
}