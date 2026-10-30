package StackandQueues;

import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> ans=new Stack<>();
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        boolean[] b=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']--;
            if(b[ch-'a']){continue;}

            while((!ans.isEmpty()) && ans.peek()>ch && (a[ans.peek()-'a']>0)){
                b[ans.pop()-'a']=false;
            }
            ans.push(ch);
            b[ch-'a']=true;

        }
        StringBuilder re=new StringBuilder(ans.toString());
        re.reverse();
        return re.toString();
    }
}
