class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(n > 0){
            int ele = n % 10;
            n /= 10;
            pq.add(ele);
        }

        return pq.poll() * pq.poll();
    }
}