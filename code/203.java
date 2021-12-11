class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        if(head.val == val) {
            while(head.val == val) {
                head = head.next;

                if(head == null) {
                    return head;
                }
            }
        }

        ListNode cur = head;
        ListNode prev = null;

        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
            }
            else {
                prev = cur;
            }
            cur = cur.next;
        }

        return head;
    }
}