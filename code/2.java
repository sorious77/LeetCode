/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        
        int cur = 0;
        int next = 0;
        while(l1 != null && l2 != null){
            cur = l1.val + l2.val + next;
            next = 0;
            
            if(cur >= 10){
                cur -= 10;
                next = 1;
            }
            
            if(head == null){
                head = new ListNode(cur);
                tail = head;
            }
            else{
                tail.next = new ListNode(cur);
                tail = tail.next;   
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1 != null){
            while(l1 != null){
                cur = l1.val + next;
                next = 0;
                if(cur >= 10){
                    cur -= 10;
                    next = 1;
                }
            
                tail.next = new ListNode(cur);
                tail = tail.next;
                l1 = l1.next;
            }
        }
        else if(l2 != null){
            while(l2 != null){
                cur = l2.val + next;
                next = 0;
                
                if(cur >= 10){
                    cur -= 10;
                    next = 1;
                }
                
                tail.next = new ListNode(cur);
                tail = tail.next;
                l2 = l2.next;
            }
        }
        
        if(next != 0)
            tail.next = new ListNode(1);
        
        return head;
    }
}