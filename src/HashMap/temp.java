package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int[] s=new int[2];
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                int value=a.get(nums[i]);
                a.put(nums[i],value+1);
            }
            else{
            a.put(nums[i],1);}
        }int i=0;
        for(Map.Entry<Integer,Integer> entry: a.entrySet()){
            if(entry.getValue()==2){
                s[i]=entry.getKey();
                i++;
            }

        }
        return s;
    }
}
