package LinkedList;
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

import java.util.HashMap;

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        HashMap<Node ,Integer> a=new HashMap<>();
        Node temp=head;
        int z=0;
        while(temp!=null){
            if(a.containsKey(temp)){
                int t=z-a.get(temp);
                return t;
            }
            a.put(temp,z);
            z++;
            temp=temp.next;
        }
        return 0;
    }
}

//note that as soon as we go inside the loop now we cannot escape that loop in linked list thus it becomes easier to calculate length
class Solution1 {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            //we use fast.next!=null to avoid null pointer exception
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int count=1;
                slow=slow.next;
                while(slow!=fast){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}