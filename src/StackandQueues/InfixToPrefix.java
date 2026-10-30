import java.util.Stack;

class Solution {
    public static int priority(char c){
        if(c=='+'|| c=='-'){
            return 1;
        }
        else if(c=='*'||c=='/'){
            return 2;
        }
        else if(c=='^'){return 3;}
        else {return -1;}
    }

    public String infixToPrefix(String s) {
        // code here
        Stack<Character> ans=new Stack<>();
        String ans1="";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='(') sb.setCharAt(i, ')');
            else if(sb.charAt(i)==')') sb.setCharAt(i, '(');
        }
        s=sb.toString();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                ans1=ans1+c;
            }
            else if (c=='('){
                ans.push(c);
            }
            else if(c==')'){
                while((!ans.isEmpty())&& ans.peek()!='('){
                    ans1=ans1+ans.pop();
                }
                ans.pop();
            }
            else {
                while((!ans.isEmpty()) && ((priority(ans.peek())>priority(c))||priority(ans.peek())==priority(c) && c!='^') ){
                    ans1=ans1+ans.pop();
                }
                ans.push(c);
            }
        }
        while(!ans.isEmpty()){
            ans1=ans1+ans.pop();
        }
        return new StringBuilder(ans1).reverse().toString();


    }
}