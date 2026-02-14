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

    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode forward=null; 

        while(temp!=null){
           forward=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forward;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // edge case 
        if(head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // this will return reverse linked list head
        ListNode temp = reverse(slow.next);

        // connecting reverse ll to middle
        slow.next=temp;

        // comparing using 2 pointers
        ListNode p1=head;
        ListNode p2=temp;

        while(p2!=null){
            if(p1.val!=p2.val) return false; 
            p1=p1.next;
            p2=p2.next;
        }

        return true;
    }
}