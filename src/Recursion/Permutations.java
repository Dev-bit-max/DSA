import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
// Approach 1
//class Solution {
//    public void permu(String initial,String rem,List<Integer> temp,List<List<Integer>> ans,int length){
//        if(initial.length()==0){
//            for(int i=0;i<rem.length();i++){
//                temp.add((int)rem.charAt(0));
//            }
//            ans.add(new ArrayList<>(temp));
//        }
//
//        for(int i=0;i<length;i++) {
//            char a = initial.charAt(0);
//            String b = initial.substring(0, i);
//            String c = initial.substring(i + 1);
//            rem=rem+"a";
//            String remaining=b+c;
//            permu(remaining,rem,temp,ans,length);
//        }
//    }
//    public List<List<Integer>> permute(int[] nums) {
//        String a = Arrays.toString(nums);
//        List<List<Integer>> ans=new ArrayList<>();
//        permu(a,new String(),new ArrayList<>(),ans,a.length());
//        return ans;
//    }
//}


//Approach 2
//class Solution {
//    public static void permutation(int[] nums,List<List<Integer>> result,int idx){
//        //we do not add temp list in fnc because it does not reset automatically
//        if(idx==nums.length){
//            List<Integer> temp=new ArrayList<>();
//            for(int i=0;i<nums.length;i++){
//                temp.add(nums[i]);
//            }
//            result.add(new ArrayList<>(temp));
//        }
//        for(int i=idx;i<nums.length;i++){
//            swap(i,idx,nums);
//            permutation(nums,result,idx+1);
//            swap(i,idx,nums);
//        }
//    }
//
//    public static void swap(int i,int idx,int[] nums) {
//        int temp=nums[i];
//        nums[i]=nums[idx];
//        nums[idx]=temp;
//    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> ans=new ArrayList<>();
//        permutation(nums,ans,0);
//        return ans;
//    }
//}

