package DailyProblems;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add((long)nums[i]);
        }

        int i=0;
        while(i<ans.size()-1){
            if(ans.get(i).equals(ans.get(i+1))){

                ans.add(i,ans.get(i)*2);
                ans.remove(i+1);
                ans.remove(i+2);

                continue;
            }
        }
        if(ans.size()>1){
            if(ans.get(0)==ans.get(1)){
                ans.add(0,ans.get(0)*2);
                ans.remove(1);
            }
        }
        return ans;
    }
}
