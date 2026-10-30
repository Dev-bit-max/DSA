package LinkedList;

import java.util.HashMap;
import java.util.Map;

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
//    public boolean isPalindrome(ListNode head) {
//        HashMap<Integer,Integer> a=new HashMap<>();
//        ListNode temp=head;
//        while(temp!=null){
//            a.put(temp.data,a.getOrDefault(temp,data,0)+1);
//            temp=temp.next;
//        }
//        boolean v=false;
//        for(Map.Entry<Integer,Integer> entry:a.entrySet()){
//            if(entry.getValue()%2==0) {
//                v = true;
//
//            }
//            else{
//                v=false;
//                break;
//            }
//        }
//        return v;
//    }
//}
