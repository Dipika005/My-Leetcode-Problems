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
    public ListNode rev(ListNode head){
        ListNode next= null;
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
        }

        ListNode revHead = rev(slow.next);
        slow.next=revHead;

        ListNode p1=head;
        ListNode p2=slow.next;
        int max=0;

        while(p2!=null){
            int sum = p1.val+p2.val;
            if(sum>max) max=sum;
            p1=p1.next;
            p2=p2.next;
        }
        return max;  
    }
}