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
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) return head;
        
        ListNode odd=head;
        ListNode even =head.next;
        ListNode evenhead=even;
        ListNode temp= even.next;
    
        while(temp!=null){
            odd.next=temp;
            odd=odd.next;
            temp=odd.next;
            if(temp==null) break;
            else{
            even.next=temp;
            even=even.next;
            temp=temp.next;  
            }
        }
        even.next=null;
        odd.next=evenhead;

        return head;

    }
}