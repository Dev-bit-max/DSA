package Codechef;

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0){
            int X=in.nextInt();
            int Y=in.nextInt();
            if(X!=0 && Y==0){
                if(X%2==0){
                    System.out.println("Bob");
                }
                else{
                    System.out.println("Alice");
                }
            }
            else if(X==0 && Y!=0){
                if(Y%2==0){
                    System.out.println("Alice");
                }
                else{
                    System.out.println("Bob");
                }
            }
            else{
               






            }
        }
    }
}
