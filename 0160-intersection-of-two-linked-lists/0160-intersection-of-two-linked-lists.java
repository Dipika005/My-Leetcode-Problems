/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0;
        int lengthB=0;

        ListNode tA=headA;
        ListNode tB=headB;

        while(tA!=null){
            lengthA++;
            tA=tA.next;
        }

         while(tB!=null){
            lengthB++;
            tB=tB.next;
        }
        tA=headA;
        tB=headB;

        if(lengthA>lengthB){
            int steps = lengthA-lengthB;
            for(int i=0;i<steps;i++){
                tA=tA.next;
            }
        }
        else{
            int steps = lengthB-lengthA;
            for(int i=0;i<steps;i++){
                tB=tB.next;
            }
        }

        while(tA!=tB){
            tA=tA.next;
            tB=tB.next;
        }
   
        return tA;
    }
}