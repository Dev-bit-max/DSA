package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//class Solution {
//    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//        // code here
//        Set<Integer> ans=new HashSet<>();
//        for(int i=0;i<a.length;i++){
//            ans.add(a[i]);
//        }
//        for(int i=0;i<b.length;i++){
//            ans.add(b[i]);
//        }
//        ArrayList<Integer> ans1=new ArrayList<>(ans);
//        return ans1;
//    }
//}

//class Solution {
//    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//        // code here
//        HashMap<Integer,Integer> ans=new HashMap<>();
//        for(int i=0;i<a.length;i++){
//            ans.put(a[i],1);
//        }
//        ArrayList<Integer> ans1=new ArrayList<>();
//        for(int i=0;i<b.length;i++){
//            ans.put(b[i],1);
//        }
//        for(int i: ans.keySet()){
//            ans1.add(i);
//        }
//        return ans1;
//    }
//}
//
//class Solution {
//    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
//        ArrayList<Integer> ans1=new ArrayList<>();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int i=0,j=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                if(ans1.isEmpty() || (ans1.get(ans1.size()-1)!=a[i])){
//                    ans1.add(a[i]);
//
//                }i++;
//            }
//            else if(b[j]<a[i]){
//                if(ans1.isEmpty() || (ans1.get(ans1.size()-1)!=b[j])){
//                    ans1.add(b[j]);
//
//                }j++;
//            }
//            else{
//                if(ans1.isEmpty() || (ans1.get(ans1.size()-1)!=b[j])){
//                    ans1.add(b[j]);
//
//                }
//                j++;
//                i++;
//            }
//
//        }
//        while(i<a.length){
//            if(ans1.isEmpty() || (ans1.get(ans1.size()-1)!=a[i])){
//                ans1.add(a[i]);
//
//            }
//            i++;
//        }
//        while(j<b.length){
//            if(ans1.isEmpty() || (ans1.get(ans1.size()-1)!=b[j])){
//                ans1.add(b[j]);
//
//            }
//            j++;
//        }
//        return ans1;
//    }
//}
