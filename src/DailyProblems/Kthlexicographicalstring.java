package DailyProblems;

import java.util.ArrayList;
import java.util.List;

//class Solution {
//    List<String> ans=new ArrayList<>();
//    public void recur(String s,int n,int k){
//        if(s.length()==n){
//            ans.add(s);
//            return;
//        }
//        char[] ch={'a','b','c'};
//        for(char c:ch){
//            if(s.length()==0 || s.charAt(s.length()-1)!=c){
//                recur(s+c,n,k);
//            }
//        }
//    }
//    public String getHappyString(int n, int k) {
//        recur("",n,k);
//        if(ans.size()<k){return "";}
//        return ans.get(k-1);
//    }
//}



class Solution {

    int happycount=0;
    String happy="";
    public void recur(String s,int n,int k){
        if(s.length()>=k){return;}
        if(s.length()==n){
            happycount++;
            if(happycount==k){
                happy=s;
                return;
            }
        }
        char[] ch={'a','b','c'};
        for(char c:ch){
            if(s.length()==0 || s.charAt(s.length()-1)!=c){
                recur(s+c,n,k);
            }
        }
    }
    public String getHappyString(int n, int k) {
        recur("",n,k);
        return happycount>=k ? happy:"";
    }
}