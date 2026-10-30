package Recursion;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class combinationsum2 {
    public void backtrack(int[] candidates,int target,int idx,List<Integer> temp,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]==candidates[i-1] && i>idx){continue;}
            if(target<candidates[i]){break;}
            temp.add(candidates[i]);
            backtrack(candidates,target-candidates[i],idx+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
}