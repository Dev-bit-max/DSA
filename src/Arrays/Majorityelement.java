package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//class Solution {
//    public List<Integer> majorityElement(int[] nums) {
//        List<Integer> a=new ArrayList<>();
//        int n=(int)Math.ceil(nums.length/3);
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            int ans=nums[i];
//            for(int j=0;j<nums.length;j++){
//                if(ans==nums[i]){count++;}
//            }
//            if(count>n){
//                if(!a.contains(nums[i])){
//                a.add(nums[i]);}}
//        }
//        return a;
//    }
//}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i, a.getOrDefault(i,0)+1);
        }
        List<Integer> s=new ArrayList<>();
        int n=nums.length/3;
        for(Map.Entry<Integer,Integer> map:a.entrySet()){
            if(map.getValue()>n){
                s.add(map.getKey());
            }
        }
        return s;
    }
}