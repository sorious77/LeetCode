class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> li = new ArrayList();
        
        ListNode temp = head;
        
        while(temp != null){
            li.add(temp);
            temp = temp.next;
        }
        
        int index = li.size() - n;
        
        if(index == 0){
            return head.next;
        }
        else if(index == li.size() - 1){
            li.get(index - 1).next = null;
        }
        else{
            li.get(index - 1).next = li.get(index + 1);
        }
        
        return head;
    }
}