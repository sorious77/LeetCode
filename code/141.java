public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList();
        
        if(head == null)
            return false;
        
        list.add(head);
        
        for(ListNode temp = head.next; temp != null; temp = temp.next){
            for(int i=0;i<list.size();i++){
                if(list.get(i) == temp)
                    return true;
            }
            
            list.add(temp);
        }
        
        return false;
    }
}