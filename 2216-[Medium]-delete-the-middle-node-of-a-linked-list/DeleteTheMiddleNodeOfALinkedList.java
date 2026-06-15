class Solution {
    public int length(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public ListNode deleteMiddle(ListNode head) {
        int len = length(head);
        if(len == 1) return null;
        else if(len == 2){
            head.next = null;
            return head;
        }

        ListNode temp = head;
        for(int i=0 ; i<(len/2)-1 ; i++){
            temp = temp.next;
        }
        if(temp.next != null && temp.next.next != null) temp.next = temp.next.next;
        else temp.next = null;

        return head;
    }
}