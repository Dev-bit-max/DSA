package DailyProblems;

class Solution {
    public int vowelConsonantScore(String s) {
        int z=0;
        int v=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                v++;
            }
            else if ((c>='0'&&c<='9')||c=='_'){
                continue;
            }
            else{z++;}
        }
        if(z==0){return 0;}
        return (int)Math.floor(v/z);
    }
}
