class Solution {
    public long dfs(int node, List<List<Integer>> children, int[] baseTime){
        List<Integer> ch = children.get(node);

        if(ch.isEmpty()) return baseTime[node];

        long earliest = Long.MAX_VALUE;
        long latest = Long.MIN_VALUE;

        for(int child : ch){
            long ft = dfs(child, children, baseTime);
            earliest = Math.min(earliest, ft);
            latest = Math.max(latest, ft);
        }

        long ownDuration = (latest - earliest) + baseTime[node];
        return latest + ownDuration;
    }
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<List<Integer>> children = new ArrayList<>();
        for(int i=0 ; i<n ; i++) children.add(new ArrayList<>());

        for(int[] edge : edges){
            children.get(edge[0]).add(edge[1]);
        }

        return dfs(0, children, baseTime);
    }
}