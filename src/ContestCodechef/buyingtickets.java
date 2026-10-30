import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0){
            int N=in.nextInt();
            int K=in.nextInt();
            int[] n=new int[N];
            for(int i=0;i<N;i++){
                n[i]=in.nextInt();
            }
            String S=in.next();
            String c=new String(S);
            int no=c.length()-c.replace("1","").length();
            if(no<K){System.out.println(-1);}
            else{
                ArrayList<Integer> ans=new ArrayList<>();
                for(int i=0;i<n.length;i++){
                    if(S.charAt(i)=='0'){
                        ans.add(n[i]);
                    }
                }
                Collections.sort(ans);
                int sum=0;
                for(int i=0;i<K;i++){
                    sum=sum+ans.get(i);
                }
                System.out.println(sum);
            }
        }
        // your code goes here

    }
}
