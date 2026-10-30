package LinkedList;

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> ans=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp);
            ans.put(temp,newnode);
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            Node newnode=ans.get(temp);
            newnode.next=ans.get(temp.next);
            newnode.random=ans.get(temp.random);
            temp=temp.next;
        }
        return ans.get(head);
    }
}
