package ContestCodechef;

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
            int[] A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=in.nextInt();
            }
            List<Integer> a=new ArrayList<>();
            for(int q:A){
                a.add(q);
            }
            boolean x=false;
            while(a.size()!=1){
                int c=a.get(a.size())+a.get(a.size()-1);
                a.remove(a.size());
                a.remove(a.size()-1);
                a.add(c);
                for(int i=0;i<a.size();i++){
                    if(a.get(i)%2==0){
                        x=true;

                    }
                    else{
                        x=false;
                        break;
                    }
                }
                if(x==true){

                    break;
                }
            }
            if(x==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}

