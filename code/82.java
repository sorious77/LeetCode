class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        if(head.val == head.next.val) {
            int val = head.val;
            ListNode temp = head;
            
            while(temp != null && temp.val == val) {
                temp = temp.next;
            }
            
            return deleteDuplicates(temp);
        }
        
        head.next = deleteDuplicates(head.next);
        
        return head;
    }
}
