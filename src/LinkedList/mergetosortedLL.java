package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode a=new ListNode(-1);
//        ListNode dummy=a;
//        ArrayList<Integer> ans=new ArrayList<>();
//        while(list1!=null){
//            ans.add(list1.val);
//            list1=list1.next;
//        }
//        while(list2!=null){
//            ans.add(list2.val);
//            list2=list2.next;
//        }
//        Collections.sort(ans);
//        int i=0;
//        while(i<ans.size()){
//            dummy.val=ans.get(i);
//            dummy=dummy.next;
//        }
//        return dummy;
//    }
//}
