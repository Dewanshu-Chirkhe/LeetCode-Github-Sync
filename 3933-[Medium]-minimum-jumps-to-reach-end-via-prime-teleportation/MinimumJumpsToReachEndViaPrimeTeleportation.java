class Solution {
    static boolean[] prime = new boolean[1_000_001];
    // Sieve of Eratosthenes (find Primes)
    static{
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for(int i=2 ; i*i <= 1000000 ; i++){
            if(prime[i]){
                for(int j=i*i ; j <= 1000000 ; j+=i){
                    prime[j] = false;
                }
            }
        }
    }

    public int minJumps(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        // store index of each element and also find the maximum element while we are at it
        Map<Integer, List<Integer>> map = new HashMap<>();
        int max = -1;
        for(int i=0 ; i<n ; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
            max = Math.max(max, nums[i]);
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;

        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        // BFS
        while(!que.isEmpty()){
            int curr = que.remove();
            List<Integer> nextJumps = new ArrayList<>();

            // adjacent
            if(curr-1 >= 0) nextJumps.add(curr - 1);
            if(curr+1 <= n) nextJumps.add(curr + 1);
            // prime teleportation
            int currEle = nums[curr];
            if(prime[currEle]){
                int p = nums[curr];
                for(int mul=p ; mul<=max ; mul+=p){
                    if(map.containsKey(mul)){
                        nextJumps.addAll(map.get(mul));
                        map.remove(mul);
                    }
                }
            }

            for(int next : nextJumps){
                if(dist[next] == -1){
                    dist[next] = dist[curr] + 1;
                    if(next == n-1) return dist[next];
                    que.add(next);
                }
            }
        }

        return dist[n-1];
    }
}