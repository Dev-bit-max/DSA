package Recursion;

class abc {
    public boolean scoreBalance(String s) {
        int sum=0,sum1=0;
        for(int i=0;i<s.length();i++){
            String a=s.substring(0,i);
            for(int j=0;j<=i;j++){
                int c=a.charAt(j);
                sum=sum+(c-96);
            }
            if(i<s.length()-2){
                String b=s.substring(i+1);
                for(int k=0;k<b.length();k++){
                    int c=a.charAt(k);
                    sum1=sum1+(c-96);
                }
            }
            if(sum==sum1){return true;}
            sum=0;
            sum1=0;
        }
        return false;
    }
}
