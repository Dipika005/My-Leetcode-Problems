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
    public ListNode findKth(ListNode head, int k){
        while (head != null && k > 1) {
            head = head.next;
            k--;
        }
        return head;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast=null;


        while(temp!=null){
            ListNode kth = findKth(temp,k);
            if(kth==null){
                if(prevLast!=null) prevLast.next=temp;
                break;
            }
            ListNode nextNode = kth.next;
            kth.next = null;
            ListNode newHead = reverse(temp);

            // Connect with previous part
            if (temp == head) {
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            // Move prevLast to end of reversed group
            prevLast = temp;

            // Move to next group
            temp = nextNode;

        }
        return head;
    }
}