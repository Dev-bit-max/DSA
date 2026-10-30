package Heaps;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);

        }
        int element;
        for(int i=0;i<k-1;i++){
            ans.poll();
        }
        return ans.poll();
    }
}
