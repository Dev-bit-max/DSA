package LinkedList;

import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashMap<ListNode,Integer> ans=new HashMap<ListNode, Integer>();
//
//        ListNode list1=headA;
//        while(list1!=null){
//            ans.put(list1,1);
//            list1=list1.next;
//        }
//        ListNode list2=headB;
//        while(list2!=null){
//            if(ans.containsKey(list2)){
//                break;
//            }
//            list2=list2.next;
//        }
//        return list2;
//    }
//}
