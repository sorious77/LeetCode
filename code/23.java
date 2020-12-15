class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<lists.length;i++){            
            for(ListNode temp = lists[i];temp!=null;temp=temp.next){
                list.add(temp.val);
            }
        }
        
        Collections.sort(list);
        
        ListNode result = new ListNode();
        if(list.size() > 0)
             result = new ListNode(list.get(0), null);
        else
            return null;
        ListNode tail = result;
        
        for(int i=1;i<list.size();i++){
            tail.next = new ListNode(list.get(i), null);
            tail = tail.next;
        }
        
        return result;
    }
}