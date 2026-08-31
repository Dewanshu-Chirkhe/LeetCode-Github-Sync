class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1 , -1};
        
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int idx = 0;
        int first = -1;
        int last = -1;
        int previdx = -1;
        int minDistance = Integer.MAX_VALUE;

        while(right != null){
            if(mid.val>left.val && mid.val>right.val || mid.val<left.val && mid.val<right.val){
                if(first == -1) first = idx;
                else{
                    minDistance = Math.min(minDistance , idx - previdx);
                    last = idx;
                }
                previdx = idx;
            }
            idx++;
            left = mid;
            mid = right;
            right = right.next;
        }

        if(first != -1 && last != -1 && first != last){
            ans[0] = minDistance;
            ans[1] = last - first;
        }

        return ans;
    }
}