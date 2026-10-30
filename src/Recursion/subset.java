package Recursion;

// User function Template for Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//class Solution {
//    public  ArrayList<ArrayList<Integer>> ans(int arr[] , int idx){
//        if(idx==arr.length){
//            ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//            result.add(new ArrayList<>());
//            return result;
//        }
//        int a=arr[idx];
//        ArrayList<ArrayList<Integer>> rem=ans(arr,idx+1);
//        ArrayList<Integer> x=new ArrayList<>();
//        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//        for(ArrayList<Integer> temp:rem){
//            ans.add(new ArrayList<>(temp));
//            ArrayList<Integer> t=new ArrayList<>(temp);
//            t.add(a);
//            ans.add(t);
//        }
//        return ans;
//    }
//    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
//        Arrays.sort(arr);
//        ArrayList<ArrayList<Integer>> res=ans(arr,0);
//        for(ArrayList<Integer> list:res){
//            Collections.sort(list);
//        }
//        res.sort((a, b) -> {
//            int min = Math.min(a.size(), b.size());
//            for (int i = 0; i < min; i++) {
//                int cmp = Integer.compare(a.get(i), b.get(i));
//                if (cmp != 0) return cmp;     // first unequal element decides
//            }
//            return Integer.compare(a.size(), b.size()); // shorter prefix comes first
//        });
//        return res;
//    }
//}
//
//
//// User function Template for Java
//
//class Solution {
//    public static HashSet<ArrayList<Integer>> subsetall(int[] nums, int idx){
//        if(idx==nums.length){
//            HashSet<ArrayList<Integer>> ans=new HashSet<>();
//            ArrayList<Integer> a=new ArrayList<>();
//            ans.add(a);
//            return ans;
//        }
//        int a=nums[idx];
//        HashSet<ArrayList<Integer>> temp=subsetall(nums,idx+1);
//        HashSet<ArrayList<Integer>> ans=new HashSet<>();
//        for(ArrayList<Integer> v:temp){
//            ArrayList<Integer> t=new ArrayList<>(v);
//            t.add(a);
//            ans.add(t);
//            ans.add(v);
//
//        }
//        return ans;
//
//    }
//    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
//        Arrays.sort(nums);
//        HashSet<ArrayList<Integer>> ans=subsetall(nums,0);
//        ArrayList<ArrayList<Integer>> a=new ArrayList<>(ans);
//        return a;
//    }
//}
