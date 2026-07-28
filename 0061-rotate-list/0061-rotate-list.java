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
     //base case
     if(head==null||head.next==null){
        return head;
     }
     if(k==0)return head;
     //basic
     ListNode curr=head;
     ListNode tail=null;
     int size=0;
     //actual rotate
    while(curr!=null){
        tail=curr;
        curr=curr.next;
        size++;
    }
    //calcu k and diff
    int newk= k%size;
    if(newk==0){
        return head;
    }
    int diff= size-newk;
    int i=0;
    curr=head;
     while(i<diff-1){
        curr=curr.next;
        i++;

     }
     // creating and make newhead
     ListNode newhead=curr.next;
     curr.next=null;
     tail.next=head;
     return newhead;

     
        
    }
}