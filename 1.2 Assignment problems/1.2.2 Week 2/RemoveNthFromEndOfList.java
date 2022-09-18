package 1.2 Assignment problems.1.2.2 Week 2;

public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp=head;
    int count=0,i=1;
    while(temp!=null){temp=temp.next;count++;}
    if(n==count) return head.next;
    int rem=count-n;
    temp=head;
    while(i<rem){
        i++;
        temp=temp.next;
    }
    temp.next=temp.next.next;
    return head;
}
