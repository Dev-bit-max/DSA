package LinkedList;
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public Node segregate(Node head) {
//        // code here
//        List<Integer> a=new ArrayList<>();
//        Node temp=head;
//        while(temp!=null){
//            a.add(temp.data);
//            temp=temp.next;
//        }
//        Collections.sort(a);
//        Node temp1=head;
//        int i=0;
//        while(temp1!=null){
//            temp1.data=a.get(i);
//            temp1=temp1.next;
//            i++;
//        }
//        return head;
//    }
//}
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//class Solution {
//    public Node merge(Node list1,Node list2){
//        Node a=list1;
//        Node b=list2;
//        Node l=new Node(0);
//        Node p=l;
//        while(a!=null && b!=null){
//            if(a.data<=b.data){
//                p.next=a;
//                a=a.next;
//
//            }
//            else{
//                p.next=b;
//                b=b.next;
//            }
//            p=p.next;
//        }
//        while(a!=null)
//        {
//            p.next=a;
//            a=a.next;
//            p=p.next;
//        }
//        while(b!=null)
//        {
//            p.next=b;
//            b=b.next;
//            p=p.next;
//        }
//        return l.next;
//    }
//    public Node segregate(Node head) {
//        if(head==null || head.next==null)
//        {
//            return head;
//        }
//        Node slow=head;
//        Node fast=head;
//        Node prev=null;
//        while(fast!=null && fast.next!=null){
//            prev=slow;
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        prev.next=null;
//        Node left=segregate(head);
//        Node right=segregate(slow);
//        return merge(left,right);
//    }
//}
//
//
//
//class Solution {
//    public Node segregate(Node head) {
//        // code here
//        int z=0;
//        int o=0;
//        int t=0;
//        Node temp=head;
//        while(temp!=null){
//            if(temp.data==0){z++;}
//            else if(temp.data==1){o++;}
//            else{t++;}
//            temp=temp.next;
//        }
//        Node temp2=head;
//        while(z!=0){
//            temp2.data=0;
//            temp2=temp2.next;
//            z--;
//        }
//        while(o!=0){
//            temp2.data=1;
//            temp2=temp2.next;
//            o--;
//        }
//        while(t!=0){
//            temp2.data=2;
//            temp2=temp2.next;
//            t--;
//        }
//        return head;
//    }
//}





