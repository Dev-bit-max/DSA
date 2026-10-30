//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//class Main {
//    //abc - [a--,b--,c--,ab-,a-c,-bc,---,abc]
//    //bc - [bc,b-,-c,--]
//    public ArrayList<String> ok(String str){
//
//        if(str.length()==0){
//            ArrayList<String> z=new ArrayList<>();
//            z.add(""); //empty subsequence
//            return z;
//        }
//        char d=str.charAt(0); //a
//        String rem=str.substring(1); //bc
//        ArrayList<String> rrem=ok(rem); ////bc - [bc,b-,-c,--] (you have to put faith ki ye ajaiga)
//        ArrayList<String> finalans=new ArrayList<>();
//        for(String r:rrem){
//            finalans.add(d+r);
//            finalans.add("-"+r);
//        }
//        //both loops giving same output but the above one is giving [abc,...] heavy output before and less heavy output later
////        for(int i=0; i<rrem.size(); i++){
////            finalans.add(d + rrem.get(i));
////            finalans.add("-" + rrem.get(i));
////        }
//        return finalans;
//    }
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        Main obj=new Main();
//        String a=in.next();
//        System.out.println(obj.ok("abc"));
//    }
//}