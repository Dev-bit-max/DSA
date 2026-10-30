package twopointerandslidingwindow;

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<t.length();i++){
            a.put(t.charAt(i),0);
        }
        int l=0,r=0;
        String ans="";
        int count=0;
        int minlen=Integer.MAX_VALUE;
        HashMap<Character,Integer> q=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(!q.containsKey(c) && a.containsKey(c)){count++;}
            q.put(c,r);
            if(count==t.length()){
                minlen=Math.min(minlen,(r-l+1));
                while(!a.containsKey(q.get(l))){
                    
                }
            }


        }
    }
}
