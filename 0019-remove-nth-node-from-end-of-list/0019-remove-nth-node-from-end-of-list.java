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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // calcu the length
     int len=0;
     ListNode curr=head;
     while(curr!=null){
        curr=curr.next;
        len=len+1;

     }
     // creating dummmy
     ListNode dummy= new ListNode(0);
     dummy.next=head;

     //jumps
         ListNode prev= dummy;
     int jumps= len-n;
     while(jumps>0){
         prev=prev.next;
        jumps=jumps-1;

     }
     prev.next=prev.next.next;
     return dummy.next;

    }
}