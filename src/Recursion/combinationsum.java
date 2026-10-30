//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
////
////class Solution {
//
////    public List<List<Integer>> combine(int[] candidates, int target, int sum, int idx) {
////        if (target == sum) {
////            List<List<Integer>> a = new ArrayList<>();
////            a.add(new ArrayList<>());
////            return a;
////        }
////        if(sum>target || idx>=candidates.length){
////            return new ArrayList<>(); //return empty list
////        }
////            List<List<Integer>> with=combine(candidates, target, sum + candidates[idx], idx );
////        for(List<Integer> w:with){
////            w.add(0,candidates[idx]);
////        }
////            List<List<Integer>> ww=combine(candidates, target, sum, idx+1);
////        with.addAll(ww);
////        return with;
////        }
////    public static void combine(int[] candidate,int target,List<List<Integer>> ans,List<Integer> temp,int idx){
//    //    if(target==0){
//   //         List<List<Integer>> a=new ArrayList<>();
//      //      a.add(new ArrayList<>());
//    //        return;
//        }
//     //   if(target<0){
//     //       return;
//    /*    }
//        //2,4,6,8
//        for(int i=idx;i<candidate.length;i++){ //2 lena hai if nhi lena toh increase index
//            temp.add(candidate[i]);
//            combine(candidate,target-candidate[i],ans,temp,i);
//
//        }
//
//    }
//
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result=new ArrayList<>();
//        combine(candidates,target,result,new ArrayList<>(),0);
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//    public boolean subset(int[] arr) {
//       }
//}
//*/
//
//// User function template for JAVA
//
//// User function template for JAVA
////
////class Solution {
////        // Function to find all combinations of elements
////        // in array arr that sum to target.
////        static void combine(int[] arr, int target, ArrayList<Integer> temp, HashSet<ArrayList<Integer>> result, int idx){
////                if(target==0){
////                        result.add(temp);
////                        return;
////                }
////                if(target<0){
////                        return;
////                }
////                if(idx>=arr.length){
////                        return;
////                }
////                if(target>0){
////                        temp.add(arr[idx]);
////                        combine(arr,target-arr[idx],temp,result,idx+1);
////                        temp.remove(temp.size()-1);
////                        combine(arr,target,temp,result,idx+1);
////                }
////
////        }
////        static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
////                HashSet<ArrayList<Integer>> result=new HashSet<>();
////                combine(arr,target,new ArrayList<>(),result,0);
////                ArrayList<ArrayList<Integer>> ans=new ArrayList<>(result);
////                return ans;
////        }
////}
////
////
////class Solution {
////        static void combine(int[] arr, int target, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> result, int idx){
////                if(target==0){
////                        result.add(new ArrayList<>(temp));
////                        return;
////                }
////                if(target<0){
////                        return;
//                }
//                if(idx>=arr.length){
//                        return;
//                }
//                if(target>0){
//                        for(int i=idx;i<arr.length;i++){
//                                if(idx<i && arr[i]==arr[i-1]){ //idx<i for edge cases like for arr[0] and arr[arr.length-1]
//                                        continue;
//                                }
//                                if(target<arr[i]){
//                                        break;
//                                }
//                                temp.add(arr[i]);
//                                combine(arr,target-arr[idx],temp,result,idx+1);
//                                temp.remove(temp.size()-1);
//                        }
//                }
//        }
//        static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
//                Arrays.sort(arr);
//                ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//                combine(arr,target,new ArrayList<>() , result,0);
//                return result;
//
//        }
//}