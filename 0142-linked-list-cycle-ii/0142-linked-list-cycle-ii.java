/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if (head == null || head.next == null) return null;
        
        ListNode slow= head;
        ListNode fast=head;

        // Step 1: Detect if cycle exists
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                // Step 2: Find the start of the cycle
                ListNode temp=head;

                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return slow; // start of cycle
            }
        }
        return null;    // no cycle    
        
    }
}