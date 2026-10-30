package twopointerandslidingwindow;

import java.util.Arrays;

class Solution {
    public String mergeCharacters(String s, int k) {
        int[] ans=new int[26];
        Arrays.fill(ans,-1);
        int prev=0;
        int current=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(ans[c-'a']==-1){
                ans[c-'a']=i;
                continue;
            }
            else{
                prev=ans[c-'a'];
                current=i;
                if((current-prev)>k){
                    ans[c-'a']=current;
                }
                else{
                    s=s.substring(0,prev)+s.substring(current+1);
                    i--;
                }
            }
        }
        return s;
    }
}
