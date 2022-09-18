package 1.2 Assignment problems.1.2.2 Week 2;

public ListNode swapPairs(ListNode head) {
    ListNode temp=head;
    while(temp!=null && temp.next!=null){
        int n=temp.val;
        temp.val=temp.next.val;
        temp.next.val=n;
        temp=temp.next.next;
    }
    return head;
}
