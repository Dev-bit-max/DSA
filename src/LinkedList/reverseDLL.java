/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

REVERSE THE DATA NOT THE POINTERS

import java.util.Stack;

class Solution {
    public Node reverse(Node head) {
        // code here
        if (head == null || head.next == null)
            return head;
        Stack<Integer> a=new Stack<>();
        Node temp=head;
        while(temp!=null) {
            a.push(temp.data);
            temp = temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=a.pop();
            temp=temp.next;
        }
        return head;
    }
} */



//SWAPPING POINTERS

/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
//class Solution {
//    public Node reverse(Node head) {
//        if (head == null || head.next == null) return head;
//
//        Node current = head;
//        Node temp = null;
//
//        while (current != null) {
//            temp = current.prev;
//            current.prev = current.next;
//            current.next = temp;
//            current = current.prev;
//        }
//        if (temp != null) {
//            head = temp.prev;
//        }
//
//        return head;
//    }
//}
