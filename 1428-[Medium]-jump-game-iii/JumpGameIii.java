class Solution {
    public boolean helper(int[] arr, int curr, boolean[] visited){
        int n = arr.length;

        if(arr[curr] == 0) return true;

        visited[curr] = true;

        int idx1 = curr + arr[curr];
        int idx2 = curr - arr[curr];

        if((idx1 >= 0 && idx1 < n) && !visited[idx1]){
            if(helper(arr, idx1, visited)) return true;
        }

        if((idx2 >= 0 && idx2 < n) && !visited[idx2]){
            if(helper(arr, idx2, visited)) return true;
        }

        return false;
    }
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        
        return helper(arr, start, visited);
    }
}