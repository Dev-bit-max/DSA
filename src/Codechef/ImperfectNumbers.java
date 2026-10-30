package Codechef;

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
            int N=in.nextInt();
            if(N%2==0 && N%5==0){
                System.out.println(Math.abs(N-(N-2)));
            }
            else if(N%2==0 &&N%5!=0){
                System.out.println(0);
            }
            else if(N%5==0 &&N%2!=0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }

    }
}

