package 1.2 Assignment problems.1.2.2 Week 2;

public ListNode deleteDuplicates(ListNode head) {
    ListNode temp=head;
    while(temp!=null){
        if(temp.next==null) break;
        if(temp.val == temp.next.val) temp.next=temp.next.next;
        else temp=temp.next;
    }
    return head;
}  
