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
        int t=in.nextInt();
        while(t-->0){
            int N=in.nextInt();
            int[] a=new int[N+1];
            for(int i=0;i<a.length;i++){a[i]=in.nextInt();}
            int m=a[0];
            int[] b=new int[N];
            for(int i=0;i<a.length-1;i++){
                int max=Math.max(a[i],a[i+1]);
                b[i]=max;
            }
            Arrays.sort(b);
            System.out.println(b[0]);

        }

    }
}

