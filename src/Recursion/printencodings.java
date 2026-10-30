package Recursion;

public class printencodings {

    public static void main(String[] args) {
        printencodings obj=new printencodings();
        obj.printen("1210444","");
    }
    public void printen(String ques,String ans)
    {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        else if(ques.length()==1){
            char c=ques.charAt(0);
            if(c=='0'){return;}
            else{
            int ch=c-'0';
            char a=(char) ('a'-1+ch);
            ans=ans+a;
            System.out.println(ans);}
        }
        else{
            char n=ques.charAt(0);
            String remm=ques.substring(1);
            if(n=='0'){
                return;
            }
            else {
                char c=ques.charAt(0);
                char a=(char) ('a'-1+c);
                printen(remm,ans+a);
            }
            String sub=ques.substring(0,2);
            String rem=ques.substring(2);
            int x=Integer.parseInt(sub);
            if(x<=26){
                char chh=(char)('a'-1+x);
                printen(rem,ans+chh);
            }
        }
    }
}
