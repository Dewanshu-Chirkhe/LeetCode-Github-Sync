class Solution {
    public long weight(int num, int depth, int h){
        return (long) num * (h - depth + 1);
    }
    public int height(int[] depth, int n){
        int h = 0;
        for(int i=0 ; i<n ; i++){
            h = Math.max(h, depth[i]);
        }
        return h;
    }
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;

        List<List<Integer>> children = new ArrayList<>();
        for(int i=0 ; i<n ; i++) children.add(new ArrayList<>());
        for(int i=1 ; i<n ; i++){
            children.get(parent[i]).add(i);
        }

        int[] depth = new int[n];
        depth[0] = 1;
        Queue<Integer> que = new LinkedList<>();
        que.offer(0);
        while(!que.isEmpty()){
            int curr = que.poll();
            for(int child : children.get(curr)){
                depth[child] = depth[curr] + 1;
                que.offer(child);
            }
        }

        int h = height(depth, n);

        long total = 0;
        for(int i=0 ; i<n ; i++){
            total += weight(nums[i], depth[i], h);
        }

        return total;
    }
}