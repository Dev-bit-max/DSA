package ContestCodechef;

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                sum=sum+weights[c-'a'];
            }
            char q=(char)('a'+sum);
            ans=ans+q;
        }
        ans=ans.trim();
        return ans;
    }
}