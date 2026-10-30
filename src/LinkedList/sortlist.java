package LinkedList;

//import java.util.ArrayList;
//import java.util.Collections;
//
//class Solution {
//    public ListNode sortList(ListNode head) {
//        ArrayList<Integer> ans=new ArrayList<>();
//        ListNode temp=head;
//        while(temp!=null){
//            ans.add(temp.val);
//            temp=temp.next;
//        }
//        Collections.sort(ans);
//        ListNode ans1=head;
//        int i=0;
//        while(ans1!=null){
//            ans1.val=ans.get(i);
//            i++;
//            ans1=ans1.next;
//        }
//        return head;
//    }
//}
//
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode findmiddle(ListNode head){
//        ListNode fast=head;
//        ListNode slow=head;
//        ListNode prev=null;
//        while(fast!=null && fast.next!=null ){
//            prev=slow;
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        prev.next=null;
//        return slow;
//    }
//    public ListNode merge(ListNode list1,ListNode list2)
//    {
//        ListNode a=list1;
//        ListNode b=list2;
//        ListNode l=new ListNode(0);
//        ListNode p=l;
//        while(a!=null && b!=null){
//            if(a.val<=b.val){
//                p.next=a;
//                a=a.next;
//            }
//            else{
//                p.next=b;
//                b=b.next;
//            }
//            p=p.next;
//        }
//        while(a!=null){
//            p.next=a;
//            a=a.next;
//            p=p.next;
//        }
//        while(b!=null){
//            p.next=b;
//            b=b.next;
//            p=p.next;
//        }
//        return l.next;
//    }
//
//    public ListNode sortList(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode middle=findmiddle(head);
//        ListNode left=sortList(head);
//        ListNode right=sortList(middle);
//        return merge(left,right);
//    }
//}
