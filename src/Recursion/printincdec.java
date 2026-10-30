package Recursion;

public class printincdec {
    public void incdec(int n){
        if(n==0){return;}
        System.out.println(n);
        incdec(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printincdec obj=new printincdec();
        obj.incdec(5);
    }
}
