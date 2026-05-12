class Solution {
    public boolean canFinishTask(int[][] tasks, int energy){
        int n = tasks.length;

        for(int i=0 ; i<n ; i++){
            if(energy < tasks[i][1]) return false;
            else energy -= tasks[i][0];
        }

        return true;
    }
    public int minimumEffort(int[][] tasks) {
        // sort 
        Arrays.sort(tasks, (a, b) -> Integer.compare(b[1] - b[0], a[1] - a[0]));

        int low = 0;
        int high = 0;
        for(int[] arr : tasks) high += arr[1];

        int minEnergy = Integer.MAX_VALUE;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(canFinishTask(tasks, mid)){
                minEnergy = mid;
                high = mid;
            }
            else low = mid + 1;
        }

        if(minEnergy == Integer.MAX_VALUE) return 1;
        else return minEnergy;
    }
}