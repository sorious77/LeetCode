class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        for(ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }
        
        int answer = 0;
        int size = list.size();
        for(int i = 0; i < size / 2; i++) {
            answer = Math.max(answer, list.get(i) + list.get(size - i - 1));
        }
        
        return answer;
    }
}
