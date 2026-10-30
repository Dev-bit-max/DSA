package DailyProblems;

import java.util.ArrayList;
import java.util.List;
//
//class Solution {
//    public String reverseWords(String s) {
//        String[] a=s.split(" ");
//        int wordlength=a[0].length();
//        int vowel=countvowels(a[0]);
//        for(int i=1;i<a.length;i++){
//            if(a[i].length()==wordlength){
//                int countvowels=countvowels(a[i]);
//                if(countvowels==vowel){
//                    StringBuilder x=new StringBuilder(a[i]);
//                    x=x.reverse();
//                    a[i]=x.toString();
//                }
//            }
//        }
//        return String.join(" ",a);
//    }
//    public int countvowels(String s){
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' ||
//                    c == 'o' || c == 'u') {
//                count++;
//            }
//        }
//        return count;
//    }
//    }

