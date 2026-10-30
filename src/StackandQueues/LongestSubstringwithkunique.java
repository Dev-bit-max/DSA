class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l=0;
        int r=0;
        int maxlen=-1;
        HashMap<Character,Integer> ans=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            ans.put(c,ans.getOrDefault(c,0)+1);
            while(ans.size()>k){
                char q=s.charAt(l);
                ans.put(q,ans.get(q)-1);
                if(ans.get(q)==0){
                    ans.remove(q);
                }
                l++;
            }
            if(ans.size()==k){
                maxlen=Math.max(maxlen,(r-l+1));
            }
            r++;
        }
        return maxlen;
    }
}