/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=head;
        int len=1;
        if(head==null) return null;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        temp=head;
        k=k%len;
        while(len!=k){
            prev=temp;
            temp=temp.next;
            len--;
        }
        prev.next=null;
        return temp;
    }
}