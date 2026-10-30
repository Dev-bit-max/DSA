package StackandQueues;

// User function Template for Java

import java.util.Stack;

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> a=new Stack<>();
        String ans="";
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if((c>='a' && c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                a.push(c);
            }
            else {
                char t1=a.pop();
                char t2=a.pop();
                String q='('+t2+c+t1+')';
            }
        }
    }
}

