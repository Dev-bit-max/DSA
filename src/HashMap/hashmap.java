package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i:nums){
            ans.put(i, ans.getOrDefault(i, 0)+1);
        }
        int anss=0;
        for(Map.Entry<Integer,Integer> map:ans.entrySet()){
            if(map.getValue().equals(n)){
                anss=map.getKey();
            }
        }
        return anss;
    }
}
