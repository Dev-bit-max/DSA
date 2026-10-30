//import java.util.HashMap;
//import java.util.Hashtable;
//
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        ListNode temp=head;
//        HashMap<ListNode,Integer> a=new HashMap<ListNode, Integer>();
//        while(temp!=null){
//            if(a.containsKey(temp)){
//                return true;
//            }
//            a.put(temp,1);
//            temp=temp.next;
//        }
//        return false;
//    }
//}



//public class Solution {


//    public boolean hasCycle(ListNode head) {
//        if (head == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow != fast && slow != null && fast != null) {
//            if(fast.next==null){break;}
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        if (slow == fast) {
//            return true;
//        }
//        return false;
//    }
//}


