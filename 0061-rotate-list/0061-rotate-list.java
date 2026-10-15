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
     if(head==null||head.next==null)return head;

     //basic
     ListNode curr=head;
     ListNode tail=null;
     int sum=0;

     while(curr!=null){
        tail=curr;
        curr=curr.next;
        sum++;
     }

     //calcu k and diff
     int newK= k%sum;
     if(newK==0){
        return head;
     }

     int diff= sum-newK;
     curr=head;
     for(int i=1; i<diff;i++){
        curr=curr.next;
     }

     //making new Listnode
     ListNode hosanode= curr.next;
     curr.next=null;
     tail.next=head;
     return hosanode;
    }
}