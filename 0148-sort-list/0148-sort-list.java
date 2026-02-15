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

    // Merge Sort

    public ListNode middle(ListNode head){
        ListNode fast = head.next;     // coz we want left mid not right
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if(left != null) temp.next = left;
        else temp.next = right;

        return dummy.next;

    }

    public ListNode sortList(ListNode head) {
        
        // edge case
        if(head==null || head.next==null) return head;

        ListNode mid=middle(head);
        ListNode leftHead=head;
        ListNode rightHead=mid.next;
        mid.next=null;      // breaking into two parts

        // recursive 
        ListNode leftH = sortList(leftHead);
        ListNode rightH = sortList(rightHead);

        return merge(leftH,rightH);
    }
}