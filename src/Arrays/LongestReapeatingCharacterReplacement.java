package Arrays;

import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> a=new HashMap<>();
        int l=0,r=0;
        int maxlen=0;
        int len=0;
        while(r<s.length()){
            char c=s.charAt(r);
            a.put(c,a.getOrDefault(c,0)+1);
            if(k<a.size()){
                while(k!=a.size()){
                    a.put(s.charAt(l),a.get(s.charAt(l))-1);
                    if(a.get(s.charAt(l))==0){
                        a.remove(s.charAt(l));
                    }
                    l++;
                }
            }
            maxlen=Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;
    }
}
