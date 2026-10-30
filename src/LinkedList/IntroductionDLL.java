package LinkedList;
public class IntroductionDLL {
    public static Node convert2all(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=0;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static Node deletehead(Node head){
        Node temp=head;
        Node prev=temp;
        if(head==null){
            return null;
        }
        if(head!=null && head.next==null){
            return null;
        }
        //more than 1 element
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    static Node deletetail(Node head){
        Node temp=head;
        Node prev=temp;
        if(head==null){
            return null;
        }
        if(head!=null && head.next==null){
            return null;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newtail=temp.back;
        newtail.next=null;
        temp.back=null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        Node head=convert2all(arr);
        deletetail(head);
        print(head);
    }
}
class Node{
    int data;
    Node next;
    Node back;
    public Node(int data1,Node next1,Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    public Node(int data2){
        this.data=data2;
        this.next=null;
        this.back=null;
    }

}

