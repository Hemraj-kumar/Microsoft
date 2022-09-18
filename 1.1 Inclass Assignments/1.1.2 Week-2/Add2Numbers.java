package 1.1 Inclass Assignments.1.1.2 Week-2;

public class Add2Numbers {
    if(list1 == null ) return list2;
        if(list2 == null ) return list1;
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        int carry=0;
        while(list1!=null || list2!=null || carry!=0){
            int x=(list1!=null)?list1.val:0;
            int y=(list2!=null)?list2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(list1!=null) list1=list1.next;
            if(list2!=null) list2=list2.next;
        }
        return temp.next;
}
