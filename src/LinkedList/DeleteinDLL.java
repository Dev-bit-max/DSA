package LinkedList;

class Node3 {
    int data;
    Node next;
    Node back;

    Node3(int val) {
        data = val;
        next = null;
        back = null;
    }
}
class DeleteinDLL {
    public Node delPos(Node head, int x) {
        Node temp=head;
        Node prev1=temp;
        if(head==null){return null;}
        int k=1;
        while(k!=x){
            temp=temp.next;
            k++;
        }
        Node front=temp.next;
        prev1=temp.back;
        if(k==1){
            //prev1 will always be null
            if(front!=null){
                front.back=null;
                head=front;
                temp.next=null;
            }
            //else
            else{head=null;}
            temp.next=null;
            return head;
        }
        if(k>1 && prev1!=null && front!=null){
            prev1.next=front;
            front.back=prev1;
            temp.next=null;
            temp.back=null;
            return head;
        }
        else if(k>1 && temp.next==null && prev1!=null){
            prev1.next=null;
            temp.back=null;
            return head;
        }
        return head;
    }
}