package Recursion;

import java.lang.reflect.Array;
import java.nio.file.SecureDirectoryStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Staircase {
//    //get staircase(u can jump from n to max 1,2,3 times
//    public ArrayList<String> getstair(int n){
//        if(n==0){
//            ArrayList<String> a=new ArrayList<>();
//            a.add("");
//            return a;
//        }
//        if(n<0){
//            ArrayList<String> b=new ArrayList<>();
//            return b;
//        }
//        ArrayList<String> path1=getstair(n-1); //i expect all paths from n-1 to 0 comes here then i can add 1 in them
//        ArrayList<String> path2=getstair(n-2);
//        ArrayList<String> path3=getstair(n-3);
//        ArrayList<String> fans=new ArrayList<>();
//        for(String path1a:path1){
//            fans.add(path1a+"1");
//        }
//        for(String path2a:path2){
//            fans.add(path2a+"2");
//        }
//        for(String path3a:path3){
//            fans.add(path3a+"3");
//        }
//        return fans;
//    }
//    public void printstaircase(int n,String ans){
//        if(n==0){
//            System.out.println(ans);
//            return;
//        }
//        if(n<0){return;}
//        printstaircase(n-1,ans+"1");
//        printstaircase(n-2,ans+"2");
//        printstaircase(n-3,ans+"3");
//    }
//    //count staircase
//    public int countstaircase(int n){
//        if(n==1){
//            return 1;
//        }
//        if(n==2){return 2;}
//        if(n==3){return 3;}
//        if(n==0){
//            return 0;
//        }
//        int path1=countstaircase(n-1);
//        int path2=countstaircase(n-2);
//        int path3=countstaircase(n-3);
//        return path1+path2+path3;
//    }
//
//    public static void main(String[] args) {
//        Staircase obj=new Staircase();
//        System.out.println(obj.countstaircase(4));
//    }
    public static List<String> stair(int n){
        if(n==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        if(n<0){
            return new ArrayList<>();
        }
        List<String> path1=stair(n-1);
        List<String> path2=stair(n-2);
        List<String> ans=new ArrayList<>();
        for(String paths1:path1){
        ans.add(paths1+"1");}
        for(String paths2:path2){
        ans.add(paths2+"2");}
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(stair(4));
    }
}
