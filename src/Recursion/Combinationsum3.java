package Recursion;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public static void chocos(int listsize, int target, List<Integer> temp, List<List<Integer>> result, int r){
        if(listsize==0 && target==0){
            result.add(new ArrayList<>(temp));
        }
        for(int i=r;i<=9;i++){
            if(i>target){
                break;
            }
            temp.add(i);
            chocos(listsize-1,target-i,temp,result,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        chocos(k,n,new ArrayList<>(),ans,1);
        return ans;
    }
}