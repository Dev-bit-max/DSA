
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int l=0;
        int r=0;
        int maxlen=0;
        int n=s.length();
        while(r<n){
            int len=0;
            if(!hash.containsKey(s.charAt(r))){

                if(l<=hash.get(s.charAt(r))){
                    l=hash.get(s.charAt(r))+1;
                }

            }
            len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash.put(s.charAt(r),r);
            r++;
        }
        return maxlen;
    }
}
