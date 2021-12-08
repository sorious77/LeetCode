class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode reverse = null;

        while (head != null) {
            ListNode temp = new ListNode(head.val);

            if (reverse == null) {
                reverse = temp;
            } else {
                temp.next = reverse;
                reverse = temp;
            }

            head = head.next;
        }

        return reverse;
    }
}