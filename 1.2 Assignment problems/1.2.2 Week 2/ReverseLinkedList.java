package 1.2 Assignment problems.1.2.2 Week 2;

public ListNode reverseList(ListNode head) {
    ListNode res=null;
    while(head!=null){
        ListNode q=head.next;
        head.next=res;
        res=head;
        head=q;
    }
    return res;
}
