class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;        
        ListNode answer = new ListNode();
        ListNode tail = answer;
        
        for(ListNode temp = head.next; temp != null; temp = temp.next) {
            while(temp.val != 0) {
                sum += temp.val;
                
                temp = temp.next;
            }
            
            tail.next = new ListNode(sum);
            tail = tail.next;
            sum = 0;
        }
        
        return answer.next;
    }
}
