/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            if(temp.child!=null){
                Node child=flatten(temp.child);
                temp.next=child;
                child.prev=temp;
                while(child.next!=null){
                    child=child.next;
                }
                child.next=t;
                if(t!=null) t.prev=child;
            }
            temp.child=null;
            temp=t;
        }
        return head;
    }
}