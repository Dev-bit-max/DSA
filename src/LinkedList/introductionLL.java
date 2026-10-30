package LinkedList;
class introduction1{
    public Node1 convertinll(int[] arr){
        Node1 head=new Node1(arr[0]);
        Node1 mover=head;
        for(int i=1;i<arr.length;i++){
            Node1 temp=new Node1(arr[i]);
            mover.next=temp;
            mover=temp;
        }
    return head;
    }
    public static Node1 insertatany(Node1 head,int x,int pos){
        //x value to be inserted
        //position where it is to be inserted
        Node1 temp=head;
        Node1 val=new Node1(x);
        if(head==null || head.next==null){
            head=val;
            return head;
        }
        if(pos==1){
            //insert at head
            head=val;
            head.next=temp;
            return head;
        }
        int count=1;
        //insert at any
        while(temp.next!=null){
            if(pos-1==count){
                val.next=temp.next;
                temp.next=val;
                return head;
            }
            count++;
            temp=temp.next;
        }
        //insert at end
        temp.next=val.next;
        temp.next=val;
        return head;
    }
//    public int length(Node head){
//        Node temp=head;
//        int l=0;
//        while(temp!=null){
//            l++;
//            temp=temp.next;
//        }
//        return l;
//        }
//public int length(Node head,int l){
//    if(head!=null){
//        length(head.next,l++);
//    }
//    return l;
//}
//int count=0;
//    public int getCount(Node head) {
//        if(head!=null){
//            count++;
//            getCount(head.next);
//        }
//        return count;
//    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        introduction1 obj=new introduction1();
        Node1 head=obj.convertinll(arr);
//        System.out.println(obj.length(head,0));
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        System.out.println(count/2);
//        Node1 headinsert=insertatany(head,7,7);
//        while(headinsert!=null){
//            System.out.println(headinsert.data);
//            headinsert=headinsert.next;
//        }
    }
}
class Node1 {
    int data;
    Node1 next;
    public Node1(int data1,Node1 next1){
    this.data=data1;
    this.next=next1;
    }
    public Node1(int data1){
        this.data=data1;
        this.next=null;
    }

}
