
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public static void permu(int[] nums, List<Integer> temp, List<List<Integer>> result, boolean[] used) {
//        if (temp.size() == nums.length ) {
//            result.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (used[i]) {
//                continue;}
//            if(i>0 && nums[i]==nums[i-1] && used[i]==false && used[i-1]==false){continue;}
//            used[i] = true;
//            temp.add(nums[i]);
//            permu(nums, temp, result, used);
//            temp.remove(temp.size() - 1);
//            used[i] = false;
//        }
//    }
//    public void nextPermutation(int[] nums) {
//        List<List<Integer>> ans=new ArrayList<>();
//        boolean[] c=new boolean[nums.length];
//        permu(nums,new ArrayList<>(),ans,c);
//        //arranges in lexicographical order
//        ans.sort((a, b) -> {
//            for (int i = 0; i < a.size(); i++) {
//                int cmp = Integer.compare(a.get(i), b.get(i));
//                if (cmp != 0) return cmp;
//            }
//            return 0;
//        });
//        List<Integer> w=new ArrayList<>();
//        for(int i:nums){
//            w.add(i);
//        }
//        int index=ans.indexOf(w);
//        List<Integer> q=new ArrayList<>();
//        if( index+1 < ans.size()){
//            q=ans.get(index+1);
//        }
//        else if(index+1>=ans.size()){
//            q=ans.get(0);
//        }
//        for(int i=0;i<nums.length;i++){
//            nums[i]=q.get(i);
//        }
//    }
//}

import java.util.Arrays;

class Solution {

    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            //reverse array
            Arrays.sort(nums);
        }
        else{
            for(int i=nums.length-1;i>index;i--){
                if(nums[index]<nums[i]){
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            Arrays.sort(nums,index+1,nums.length);}
    }

}