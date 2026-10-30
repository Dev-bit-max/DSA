package StackandQueues;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> queue = new ArrayDeque<>();

        //mono dec stack
        int[] ans=new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){

            if(!queue.isEmpty() && queue.peekLast()<=i-k){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            if(i>=k-1){
                ans[j++]=nums[queue.peekFirst()];
            }


        }
        return ans;




    }
}
