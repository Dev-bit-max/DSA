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
            boolean a=true;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)=='?' && s.charAt(s.length()-i-1)=='?'){
                    a=false;
                    break;
                }
            }
            if (N % 2 == 1 && s.charAt(N / 2) == '?') {
                a = false;
            }


            if(a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}