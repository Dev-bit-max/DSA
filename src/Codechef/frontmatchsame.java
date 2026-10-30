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
            String s=in.next();
            int count=0;
            int[] hash=new int[26];
            for(char c:s.toCharArray()){
                hash[c-'a']++;
                if(hash[c-'a']>=2){
                    count++;
                    break;
                }
            }
            if(count==1){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }

    }
}

