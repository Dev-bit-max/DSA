package Arrays;

import java.util.*;

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> ans=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;j<nums.length;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> a=new ArrayList<>();
//                        a.add(nums[i]);
//                        a.add(nums[j]);
//                        a.add(nums[k]);
//                        Collections.sort(a);
//                        ans.add(a);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> ans1=new ArrayList<>(ans);
//        return ans1;
//    }
//}


import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> b=new HashMap<>();
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(b.containsKey(third)){
                    List<Integer> a=new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(third);
                        Collections.sort(a);
                        ans.add(a);
                }
                b.put(nums[j],1);
            }
        }
        List<List<Integer>> ans1=new ArrayList<>(ans);
        return ans1;
    }
}
