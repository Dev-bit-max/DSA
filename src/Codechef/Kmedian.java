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
            int K=in.nextInt();
            int[] A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=in.nextInt();
            }
            Arrays.sort(A);
            Set<Integer> ans=new HashSet<>();
            for(int i=0;i<K;i++){
                ans.add(A[i]);
            }
            Integer[] b = ans.toArray(new Integer[0]);
            for(int a:b){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

