class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if(n == 0) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            int ele = arr[i];
            map.putIfAbsent(ele, new ArrayList());
            map.get(ele).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        int steps = 0;
        q.offer(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int size = q.size();

            for(int s=0 ; s<size ; s++){
                int curr = q.poll();

                if(curr == n-1) return  steps;

                List<Integer> same = map.get(arr[curr]);

                if(same != null){
                    for(int idx : same){
                        if(!visited[idx]){
                            visited[idx] = true;
                            q.offer(idx);
                        }
                    }
                    map.remove(arr[curr]);
                }

                // curr + 1
                if (curr + 1 < n && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    q.offer(curr + 1);
                }

                // curr - 1
                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    q.offer(curr - 1);
                }
            }

            steps++;
        }

        return -1;
    }
}