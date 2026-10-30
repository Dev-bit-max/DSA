package DailyProblems;

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0){
            int N=in.nextInt();
            String S=in.next();
            int a=1;
            S=S.toLowerCase();
            int count=0;
            int maxcount=0;
            for(int i=0;i<N;i++){
                char c=S.charAt(i);
                if(i!=0 &&S.charAt(i)!=S.charAt(i-1)){
                    a--;
                }
                if(a==-1){
                    maxcount=Math.max(maxcount,count);
                    count=0;
                    a=1;
                }
                count++;
            }
            System.out.println(maxcount);
        }
    }
}
