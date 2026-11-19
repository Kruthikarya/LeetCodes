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
    //base ideas
    ListNode curr=head;
    ListNode tail=null;
    int sum=0;


    while(curr!=null){
        tail=curr;
        curr=curr.next;
        sum++;
    }

    //calcu k
    int newK = k%sum;
    if(newK==0){
        return head;
    }

    //calcu difference 
    int diff= sum-newK;
    curr=head;
    for(int i=0;i<diff-1;i++){
        curr=curr.next;
    }


    ListNode hasondu= curr.next;
    curr.next=null;
    tail.next=head;
    return hasondu;
    }
}