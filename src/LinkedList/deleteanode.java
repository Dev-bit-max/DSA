//class Solution {
//    public ListNode modifiedList(int[] nums, ListNode head) {
//
//        HashSet<Integer> a=new HashSet<>();
//        ListNode dummy=new ListNode(0,head);
//        for(int i=0;i<nums.length;i++){
//            a.add(nums[i]);
//        }
//        for(int i=0;i<a.size();i++){
//            ListNode ans=dummy;
//            while(ans!=null){
//                while(ans.next!=null && a.contains(ans.next.val))
//                {
//                    ans.next=ans.next.next;
//                }
//                ans=ans.next;
//
//            }
//        }
//        return dummy.next;
//    }
//}
