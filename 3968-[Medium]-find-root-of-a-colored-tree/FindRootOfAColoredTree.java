class Solution {
    private boolean isNextColor(char curr, char next){
        if(curr == 'R') return next == 'B';
        if(curr == 'B') return next == 'W';
        return next == 'R';
    }
    private boolean isValid(int root, List<List<Integer>> adj, String colors, int n){
        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();

        que.offer(root);
        visited[root] = true;

        while(!que.isEmpty()){
            int size = que.size();

            for(int i=0 ; i<size ; i++){
                int node = que.poll();
                int children = 0;

                for(int next : adj.get(node)){
                    if(visited[next]) continue;

                    if(!isNextColor(colors.charAt(node), colors.charAt(next))) return false;

                    children++;

                    if(children > 2) return false;

                    visited[next] =  true;
                    que.offer(next);
                }
            }
        }

        return true;
    }
    public int findColoredRoot(int[][] edges, String colors) {
        int n = colors.length();
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];
        
        for(int i=0 ; i<n ; i++) adj.add(new ArrayList<>());

        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            char cu = colors.charAt(u);
            char cv = colors.charAt(v);

            if(cu == cv) return -1;

            if(isNextColor(cu, cv)){
                adj.get(u).add(v);
                indegree[v]++;
            }
            else{
                adj.get(v).add(u);
                indegree[u]++;
            }
        }

        int root = -1;

        for(int i=0 ; i<n ; i++){
            if(indegree[i] == 0){
                if(root != -1) return -1;
                root = i;
            }
            else if(indegree[i] != 1) return -1;
        }

        if(root == -1) return -1;

        if(isValid(root, adj, colors, n)) return root;
        
        return -1;
    }
}