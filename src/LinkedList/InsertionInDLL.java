package LinkedList;


public class InsertionInDLL {

static Node convert2all(int[] arr){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=0;i<arr.length;i++){
        Node temp=new Node(arr[i],null,prev);
        prev.next=temp;
        prev=temp;
    }
    return head;
}

static Node insertathead(Node head,int x){
    //x is the value to be inserted
    Node val=new Node(x);
    Node temp=head;
    if(head==null){return val;}
    temp.back=val;
    val.next=temp;
    val.back=null;
    head=val;
    return head;
}
static Node insertattail(Node head,int x){
    Node temp=head;
    Node val=new Node(x);
    if(head==null){return val;}
    while(temp.next!=null){temp=temp.next;}
    temp.next=val;
    val.back=temp;
    val.next=null;
    return head;
}
static Node insertatany(Node head,int x,int pos) {
    Node val = new Node(x);
    Node temp = head;
    int count = 1;
    while (count != pos) {
        temp = temp.next;
        count++;
    }
    Node front = temp.next;
    Node prev = temp.back;
    if(count>1 && front!=null && prev!=null){
        prev.next=val;
        val.back=prev;
        temp.back=val;
        val.next=temp;
    }
return head;
}
    public static void main(String[] args) {
        int arr[]= {0,2,4,5,7,8};
        Node head=convert2all(arr);

    }
}
