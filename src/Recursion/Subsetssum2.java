package Recursion;

import java.util.*;
import java.util.jar.JarEntry;

////brute force
//class Solution {
//    public HashSet<List<Integer>> subset(int[] nums,int idx){
//        if(idx==nums.length){
//            HashSet<List<Integer>> a=new HashSet<>();
//            a.add(new ArrayList<>());
//            return a;
//        }
//        int c=nums[idx];
//        HashSet<List<Integer>> rem=subset(nums,idx+1);
//        List<Integer> remm=new ArrayList<>();
//        HashSet<List<Integer>> ans=new HashSet<>();
//        for(List<Integer> remmm:rem) {
//            ans.add(new ArrayList<>(remmm));
//            List<Integer> temp = new ArrayList<>(remmm);
//            temp.add(c);
//            ans.add(temp);
//        }
//        return ans;
//
//    }
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//
//    }}
//    public static void main(String[] args) {
//        Subsetssum obj=new Subsetssum();
//        int[] arr={1,2,2};
//        System.out.println(obj.subsets(arr));
//    }
//}
//optimized

//class Solution {
//    public static void subset(int[] nums, int idx, List<List<Integer>> ans, List<Integer> temp) {
//        ans.add(new ArrayList<>(temp));
//        for (int i = idx; i < nums.length; i++) {
//            if (i != idx && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            temp.add(nums[i]);
//            subset(nums, i + 1, ans, temp);
//            temp.remove(temp.size() - 1);
//        }
//    }
//
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        subset(nums, 0, result, new ArrayList<>());
//        return result;
//    }
//}
//
////    public static void main(String[] args) {
////        System.out.println(subset);
////    }
////}