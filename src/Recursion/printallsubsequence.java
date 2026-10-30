//package Recursion;
//
//import java.util.ArrayList;
//public class Main {
//    String[] map={"abc","def..."};
//    public void printall(String ques,String ans){
//        if(ques.length()==0){
//            System.out.println(ans);
//            return;
//        }
//        char c=ques.charAt(0);
//        ques=ques.substring(1);
//        String s=map[c-'0'];
//        for(int i=0;i<s.length();i++){
//            char q=s.charAt(i);
//        printall(ques,ans+q);}
//    }
//
//    public static void main(String[] args) {
//        Main ob=new Main();
//        ob.printall("abc","");
//    }
//}
