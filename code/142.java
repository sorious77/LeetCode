public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();
        
        while(temp != null) {
            if(set.contains(temp)) {
                return temp;
            }
            
            set.add(temp);
            temp = temp.next;
        }
        
        return null;
    }
}
