class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        
        while(head != null) {
            nodes.add(head.val);
            
            head = head.next;
        }
        
        int start = 0;
        int end = nodes.size() - 1;
        
        while(start <= end) {
            if(nodes.get(start) != nodes.get(end)) {
                return false;
            }
            
            start += 1;
            end -= 1;
        }
        
        return true;
    }
}
