package Recursion;

import java.util.ArrayList;

//package Recursion;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
class MazePathwithjumpsolution{
//    public ArrayList<String> mazepath(int ir,int ic,int tr,int tc){
//        if(ic==tc && ir==tr){
//            ArrayList<String> base=new ArrayList<>();
//            base.add("");
//            return base;
//        }
//        ArrayList<String> path=new ArrayList<>(); //to store complete path
//        //horizontal moves
//        for(int ms=1;ms<=tc-ic;ms++){
//            ArrayList<String> hpath=mazepath(ir,ic+ms,tr,tc);
//            for(String hpaths:hpath){
//                path.add("h"+ms+hpaths);
//            }
//        }
//        //vertical moves
//        for(int mv=1;mv<=tr-ir;mv++){
//            ArrayList<String> vpath=mazepath(ir+mv,ic,tr,tc);
//            for(String vpaths:vpath){
//                path.add("v"+mv+vpaths);
//            }
//        }
//        //diagonal moves
//        for(int md=1;md<=tr-ir && md<=tc-ir ; md++){
//            ArrayList<String> dpath=mazepath(ir+md,ic+md,tr,tc);
//            for(String dpaths:dpath){
//                path.add("d"+md+dpaths);
//            }
//        }
//        return path;
//    }
    public void printmazepath(int r,int c,int tr,int tc,String ans){

        if(r==tr && c==tc){
            System.out.println(ans);
        }
        for(int h=1;h<=tc-c;h++){
            printmazepath(r,c+h,tr,tc,ans+"h"+h);
        }
        for(int v=1;v<=tr-r;v++){
            printmazepath(r+v,c,tr,tc,ans+"v"+v);
        }
        for(int d=1;d<=tc-c && d<=tr-r;d++){
            printmazepath(r+d,c+d,tr,tc,ans+"d"+d);
        }
    }
    public static void main(String[] args) {
        MazePathwithjumpsolution obj=new MazePathwithjumpsolution();
        obj.printmazepath(1,1,3,3,"");
    }
}