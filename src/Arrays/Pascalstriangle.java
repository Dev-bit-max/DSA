package Arrays;

//public class Pascalstriangle {
//    public static int factorial(int a){
//        if(a==0|| a==1){return 1;}
//        int sum=1;
//        while(a!=0){
//            sum=sum*a;
//            a--;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int r=3,c=2;
////        int ans=factorial(r-1)/(factorial(c-1)*factorial(r-c));
////        System.out.println(ans);
//        c=c-1;
//        r=r-1;
//        int u=1;
//        for(int i=1;i<=c;i++){
//            u=u*r;
//            r--;
//        }
//        System.out.println(u/factorial(c));
//    }
//}

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> aa=new ArrayList<>();
        aa.add(1);
        a.add(aa);
        for(int i=2;i<numRows;i++){
            List<Integer> ans=new ArrayList<>();
            int sum=1;
            ans.add(1);
            for(int j=1;j<i;j++){
                sum=sum*((i-j)/j);
                ans.add(sum);
            }
            a.add(ans);
        }
        return a;
    }
}