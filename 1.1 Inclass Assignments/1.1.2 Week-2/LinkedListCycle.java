package 1.1 Inclass Assignments.1.1.2 Week-2;
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        // ListNode temp=head;
        while(fast!=null && fast.next!=null){
            if(slow == fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
}
