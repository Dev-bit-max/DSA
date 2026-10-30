package DailyProblems;

import java.util.HashSet;

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
//    public ListNode modifiedList(int[] nums, ListNode head) {
//
//        HashSet<Integer> a=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            a.add(nums[i]);
//
//        }
//        for(int i=0;i<a.size();i++){
//            ListNode temp=head;
//            if(head.next==null){
//            if(a.contains(temp.val)){
//                return null;
//            }}
//            while(temp!=null){
//                if(a.contains(temp.val)){
//                    temp=temp.next.next;
//                }
//                else{
//                temp=temp.next;}
//            }
//        }
//        return head;
//    }
//}
