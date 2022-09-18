class Solution {
    public Node copyRandomList(Node head) {
        Node iter=head;Node front=head;
        while(iter!=null){
            front=iter.next;
            Node copy=new Node(iter.val);
            iter.next=copy;
            copy.next=front;
            iter=front;
        }
        iter=head;
        while(iter!=null){
            if(iter.random!=null){
                iter.next.random=iter.random.next;
            }
            iter=iter.next.next;
        }
        iter=head;
        Node dummy=new Node(0);
        Node cpy=dummy;
        while(iter!=null){
            front = iter.next.next;
            cpy.next=iter.next;
            cpy=cpy.next;
            iter.next=front;
            iter=front;
            
        }
        return dummy.next;
    }
    
}