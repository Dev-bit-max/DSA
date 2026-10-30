package Recursion;

public class PrintPermutations {
    public void printpermu(String ques,String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
        }
        for(int i=0;i<ques.length();i++)
        {
            char c=ques.charAt(i);
            String a=ques.substring(0,i);
            String b=ques.substring(i+1);
            String d=a+b;
            printpermu(d,ans+c);
        }
    }

    public static void main(String[] args) {
        PrintPermutations obj=new PrintPermutations();
        obj.printpermu("abc","");
    }
}
