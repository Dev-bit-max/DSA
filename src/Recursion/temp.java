package Recursion;

import java.util.HashMap;
import java.util.Map;
//
//class Solution {
//    public String majorityFrequencyGroup(String s) {
//        HashMap<Character,Integer> a=new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//            a.put(s.charAt(i), a.getOrDefault(s.charAt(i),0)+1);
//        }
//        HashMap<Integer,Integer> v=new HashMap<>();
//        int maxcount=0;
//        for(int k:a.values()){
//            v.put(k,v.getOrDefault(k,0)+1);
//        }
//        int targetfreq=-1;
//        for(Map.Entry<Integer,Integer> e:v.entrySet()){
//            if(maxcount<e.getValue()){
//                maxcount=e.getValue();
//                targetfreq=e.getKey();
//            }
//        }
//        String x="";
//        for(Map.Entry<Character,Integer> d:a.entrySet()){
//            if(targetfreq==d.getValue()){
//                x=x+d.getKey();
//            }
//        }
//        return x;
//    }
//}
