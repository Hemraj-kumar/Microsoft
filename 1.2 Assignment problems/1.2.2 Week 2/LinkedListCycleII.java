package 1.2 Assignment problems.1.2.2 Week 2;

public ListNode detectCycle(ListNode head) {
    ListNode fast=head;ListNode slow=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }
    return null;
