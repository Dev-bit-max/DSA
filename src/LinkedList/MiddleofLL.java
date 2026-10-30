package LinkedList;
// BRUTE FORCE
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode temp=head;
//        int c=0;
//        while(temp!=null){
//            c++;
//            temp=temp.next;
//        }
//        c=(c/2);
//        for(int i=1;i<=c;i++){
//            head=head.next;
//        }
//        return head;
//    }
//}

//OPTIMAL APPROACH
//TORTOISE AND HARE ALGO
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
//    public ListNode middleNode(ListNode head) {
//        ListNode temp=head;
//        ListNode fastn=head;
//        while ( fastn!=null && temp!=null && fastn.next!=null ){
//            fastn=fastn.next.next;
//            temp=temp.next;
//        }
//        return temp;
//    }
//}