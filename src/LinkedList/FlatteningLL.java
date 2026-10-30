package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code herE
        ArrayList<Integer> ans=new ArrayList<>();
        Node a=new Node(0);
        Node ansnode=a;
        Node temp=root;
        Node temp1=root;
        while(temp1!=null){
            ans.add(temp.data);
            temp=temp.bottom;
            if(temp==null){temp1=temp1.next;
            temp=temp1;}
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            ansnode.next=new Node(ans.get(i));
            ansnode=ansnode.next;
        }
        ansnode.next=null;
        return a.next;

    }
}