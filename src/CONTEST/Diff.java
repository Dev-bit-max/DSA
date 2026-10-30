package CONTEST;

import java.util.HashMap;

class Solution {
    public int peakValleyDifference(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(i,nums[i]);
        }
        int peak=0;
        int valley=0;
        for(int i=1;i<nums.length-1;i++){
            int curr=nums[i];
            int prev=ans.get(i-1);
            int fut=ans.get(i+1);
            if(curr>prev && curr>fut){peak+=curr;}
            else if(curr<prev && curr<fut){valley+=curr;}
        }
        return peak-valley;
    }
}
