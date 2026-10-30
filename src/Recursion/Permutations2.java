package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//class Solution {
//    public void permu(int[] nums, List<Integer> temp, HashSet<List<Integer>> result, boolean[] check){
//        if(temp.size()==nums.length){
//            result.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(check[i]==false){
//                check[i]=true;
//                temp.add(nums[i]);
//                permu(nums,temp,result,check);
//                temp.remove(temp.size()-1);
//                check[i]=false;
//            }
//        }
//    }
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        HashSet<List<Integer>> ans=new HashSet<>();
//        boolean[] a=new boolean[nums.length];
//        permu(nums,new ArrayList<>(),ans,a);
//        List<List<Integer>> result=new ArrayList<>(ans);
//        return result;
//    }
//}

//Same time complexcity
//because we still are generating dublicates and checking at the last
//but space complexcity have  reduced as we re not checking by hashmap
//class Solution {
//    public static void permu(int[] nums, List<Integer> temp, List<List<Integer>> result, boolean[] used) {
//        if (temp.size() == nums.length && !result.contains(temp)) {
//            result.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (used[i]) {
//                continue;
//            }
//            used[i] = true;
//            temp.add(nums[i]);
//            permu(nums, temp, result, used);
//            temp.remove(temp.size() - 1);
//            used[i] = false;
//        }
//    }
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        List<List<Integer>> ans=new ArrayList<>();
//        boolean[] used=new boolean[nums.length];
//        permu(nums,new ArrayList<>(),ans,used);
//        return ans;
//    }
//}

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
//            if(nums[i]==nums[i-1] && i>0 && used[i]==false && used[i-1]==false){continue;}
//            used[i] = true;
//            temp.add(nums[i]);
//            permu(nums, temp, result, used);
//            temp.remove(temp.size() - 1);
//            used[i] = false;
//        }
//    }
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans=new ArrayList<>();
//        boolean[] used=new boolean[nums.length];
//        permu(nums,new ArrayList<>(),ans,used);
//        return ans;
//    }
//}