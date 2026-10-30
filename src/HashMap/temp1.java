package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
//
//class Solution {
//    public boolean kLengthApart(int[] nums, int k) {
//        HashMap<Integer,Integer> ans=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            ans.put(nums[i],i+1);
//        }
//        int[] a=new int[ans.size()];
//        int g=0;
//        for(Map.Entry<Integer,Integer> entry:ans.entrySet()){
//            if(entry.getValue().equals(1)){
//                a[g]=entry.getKey();
//                g++;
//            }
//        }
//        for(int i=0;i<a.length-1;i++){
//            if(a[i]==0){break;}
//             if(a[i+1]-a[i]<k){
//                return false;
//            }
//        }
//        return true;
//    }
//}
