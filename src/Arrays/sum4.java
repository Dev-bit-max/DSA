package Arrays;

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) {
                continue;}
                for (int j = i + 1; j < nums.length; j++) {
                        int first = nums[i];
                        int second = nums[j];
                        if (j > 0 && nums[j] == nums[j - 1]) {
                            continue;
                        }
                        int left=j+1,right=nums.length-1;
                        while(left<right){
                            int sum=nums[i]+nums[j]+nums[left]+nums[right];
                            if(sum==target){
                                ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                                left++;
                                right--;
                                while(nums[left]==nums[left-1] && left<right){left++;}
                                while(nums[right]==nums[right+1] && left<right){right--;}
                            }
                            else if(sum<target){
                                left++;
                            }
                            else{
                                right--;
                            }
                        }
                    }
                }
        return ans;
    }
}
