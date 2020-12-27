class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode first, second;
        ListNode temp = head;
        
        while(true){            
            if(temp == null || temp.next == null)
                break;
            
            first = temp;
            second = temp.next;
            
            if(prev == null){ // head
                head = second;
            }
            else{ // not head
                prev.next = second;
            }
            first.next = second.next;
            second.next = first;
            prev = first;
            temp = first.next;
        }
        
        return head;
    }
}