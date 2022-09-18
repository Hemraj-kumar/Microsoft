package 1.1 Inclass Assignments.1.1.2 Week-2;

public class ReverseLinkedList {
    ListNode res=null;
        while(head!=null){
            ListNode q=head.next;
            head.next=res;
            res=head;
            head=q;
        }
        return res;
}
