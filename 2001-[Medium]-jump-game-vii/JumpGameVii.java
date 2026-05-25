class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();

        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int farthest = 0;

        que.offer(0);
        visited[0] = true;

        while(!que.isEmpty()){
            int curr = que.poll();
            if(curr == n-1) return true;

            int lower = Math.max(farthest + 1, curr + minJump);
            int upper = Math.min(n - 1, curr + maxJump);

            for(int i=lower ; i<=upper ; i++){
                if(s.charAt(i) != '0' || visited[i]) continue;
                que.offer(i);
                visited[i] = true;
            }

            farthest = upper;
        }

        return false;
    }
}