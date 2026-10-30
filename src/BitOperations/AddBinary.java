package BitOperations;

class Solution {
    public String addBinary(String a, String b) {
        int max=Math.max(a.length(),b.length());
        if(a.length()>b.length()){
            int diff=a.length()-b.length();
            for(int i=0;i<diff;i++){
                b=b+'0';
            }
        }
        else if(a.length()<b.length()){
            int diff=b.length()-a.length();
            for(int i=0;i<diff;i++){
                a=a+'0';
            }
        }
        int carry=0;
        String ans="";
        for(int i=max-1;i>=0;i--){
            char c=a.charAt(i);
            char d=b.charAt(i);
            int sum=(int)c +(int)d+carry;
            if(sum==0){carry=0;ans=ans+'0';}
            else if(sum==1){carry=0;ans=ans+'1';}
            else if(sum==2){carry=1;ans=ans+'0';}
            else if(sum==3){carry=1;ans=ans+'1';}
        }
        if(carry==1){
            ans=ans+'1';
        }
        return ans;
    }
}