package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums.length<2){
            return new int[]{-1,-1};
        }
        TreeMap<Integer,Integer> ans=new TreeMap<>();
        for(int i:nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        if(ans.size()<2){
            return new int[]{-1,-1};
        }
        List<Integer> b=new ArrayList<>(ans.keySet());
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<b.size()-1;i++){
            for(int j=i+1;j<b.size();j++){
                int val1=ans.get(b.get(i));
                int val2=ans.get(b.get(j));
                if(val1!=val2){
                   return new int[]{b.get(i),b.get(j)};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
