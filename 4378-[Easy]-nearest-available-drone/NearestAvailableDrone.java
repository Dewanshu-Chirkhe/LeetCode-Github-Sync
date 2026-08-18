class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int x2 = target[0];
        int y2 = target[1];
        int minDist = Integer.MAX_VALUE;
        int minIdx = -1;
        
        
        for(int i=0 ; i<n ; i++){
            int x1 = drones[i][0];
            int y1 = drones[i][1];
            int range = drones[i][2];

            int dist = Math.abs(x2 - x1) + Math.abs(y2 - y1);
            if(dist < minDist && dist <= range){
                minDist = dist;
                minIdx = i;
            }
        }

        return minIdx;
    }
}