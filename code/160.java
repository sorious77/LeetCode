public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for(ListNode tempA = headA;tempA!=null;tempA=tempA.next){
            for(ListNode tempB = headB;tempB!=null;tempB=tempB.next){
                if(tempA == tempB){
                    return tempA;
                }
            }
        }
        
        return null;
    }
}