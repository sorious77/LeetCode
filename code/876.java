class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        
        while(head != null) {
            nodes.add(head);
            head = head.next;
        }
        
        return nodes.get(nodes.size() / 2);
    }
}
