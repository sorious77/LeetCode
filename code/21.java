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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), tail = new ListNode();
        
        if(l1 == null && l2 == null)
            return null;
        else if(l2 == null){
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        else if(l1 == null){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }
        else{
            if(l1.val > l2.val){
                head = new ListNode(l2.val);
                l2 = l2.next;
            }
            else{
                head = new ListNode(l1.val);
                l1 = l1.next;
            }
        }
        tail = head;
        
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                tail.next = new ListNode(l2.val);
                tail = tail.next;
                l2 = l2.next;
            }
            else{
                tail.next = new ListNode(l1.val);
                tail = tail.next;
                l1 = l1.next;
            }
        }
        
        if(l1 == null){
            while(l2 != null){
                tail.next = new ListNode(l2.val);
                tail = tail.next;
                
                l2 = l2.next;
            }
        }
        else{
            while(l1 != null){
                tail.next = new ListNode(l1.val);
                tail = tail.next;
                
                l1 = l1.next;
            }
        }
        
        return head;
    }
}