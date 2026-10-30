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
            int[] B=new int[N];
            for(int i=0;i<N;i++){A[i]=in.nextInt();}
            for(int i=0;i<N;i++){B[i]=in.nextInt();}
            int[][] pairs=new int[N][2];
            int maxTaste = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {

                    int a = A[i];
                    int b = A[j];

                    int expensive = Math.max(a, b);
                    int cheap = Math.min(a, b);

                    int discount = Math.min(expensive / 2, 100);

                    int cost = cheap + (expensive - discount);

                    if (cost <= K) {
                        maxTaste = Math.max(maxTaste, B[i] + B[j]);
                    }
                }
            }

            System.out.println(maxTaste);
        }
        }

    }


