// User function Template for Java
package Recursion;
import java.util.ArrayList;
import java.util.List;

class GenerateAllBinaryString {
    public static List<String> generateBinaryStrings(int n) {
        if(n==0)
        {
            List<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        List<String> c=generateBinaryStrings(n-1);
        List<String> d=new ArrayList<>();
        for(String ans:c){
            d.add(ans+0);
            if(ans.length()==0 || ans.charAt(ans.length()-1)!='1'){
                d.add(ans+1);}
        }
        return d;
    }
}
