package Recursion;

public class Abbrevation {
    public static void abbre(String str,String asf,int count,int pos){
        if(str.length()==0){
            if(count>0) asf+=count;
            System.out.println(asf);

            return;
        }
        char c=str.charAt(0);
        String rem=str.substring(1);
        if(count>0){
            abbre(rem,asf+c+count,0,pos);
        }
        else{
            abbre(rem,asf+c,0,pos);
        }
        abbre(rem,asf,count+1,pos);
    }

    public static void main(String[] args) {
        abbre("pep","",0,0);

    }
}
