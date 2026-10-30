//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public static void parents(int open,int close,int n,String a,List<String> result) {
//        if(open==close && open+close==n*2){
//            result.add(a);
//        }
//        if(open<n){
//            parents(open+1,close,n,a+"(",result);
//        }
//        if(close<open){
//            parents(open,close+1,n,a+")",result);
//        }
//    }
//    public List<String> generateParenthesis(int n){
//        List<String> p=new ArrayList<>();
//        parents(0,0,n,new String(),p);
//        return p;
//    }
//}
