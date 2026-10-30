package StackandQueues;

import java.util.HashMap;

class Solution {
    public int uniquearray(int[] nums,int k){
        int l=0;
        int r=0;
        int count=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        while(r<nums.length){
            ans.put(nums[r],ans.getOrDefault(nums[r],0)+1);
            while(ans.size()>k){
                ans.put(nums[l],ans.get(nums[l])-1);
                if(ans.get(nums[l])==0){
                    ans.remove(nums[l]);
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return uniquearray(nums,k)-uniquearray(nums,k-1);
    }
}
