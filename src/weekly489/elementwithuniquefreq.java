import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        HashMap<Integer,Integer> q=new HashMap<>();
        for(int a:nums){
            ans.put(a,ans.getOrDefault(a,0)+1);

        }
        for(int b:ans.values()){
        q.put(b,q.getOrDefault(b,0)+1);
        }
        if(q.size()==ans.size()){

            for(Map.Entry<Integer,Integer> entry:ans.entrySet()){
                return entry.getKey();
                }
            }
        else if(q.size()==1){return -1;}
        else if(q.size()!=ans.size()){
            int freq=0;
            for(Map.Entry<Integer,Integer> entry:q.entrySet()){
                if(entry.getValue()==1){
                    freq= entry.getKey();
                    break;
                }
            }
            for(Map.Entry<Integer,Integer> entry:ans.entrySet()) {
                if (entry.getValue() == freq) {
                    return entry.getKey();
                }
            }
        }
        return -1;
        }

    public static void main(String[] args) {
        Solution a=new Solution();
        int[] nums={2,1,1,44,0,43};
        a.firstUniqueFreq(nums);

    }
    }