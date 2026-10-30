import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        if(s.charAt(0)==')' || s.charAt(0)=='}' ||s.charAt(0)==']'){return false;}
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                a.push(s.charAt(i));
            }
            else{
                if(s.isEmpty()){return false;}
                if(s.charAt(i)==')' && a.peek()=='('){
                    a.pop();
                }
                if(s.charAt(i)=='}' && a.peek()=='{'){
                    a.pop();
                }
                if(s.charAt(i)==']' && a.peek()=='['){
                    a.pop();
                }
            }

        }
        if(a.isEmpty()){return true;}
        return false;

    }
}