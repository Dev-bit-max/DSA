package DailyProblems;

//class Solution {
//    public String reverse(String a){
//        String b="";
//        for(int i=a.length()-1;i>=0;i--){
//            b=b+a.charAt(i);
//        }
//        return b;
//    }
//    public String invert(String a){
//        String b="";
//        for(int i=0;i<a.length();i++){
//            char c=a.charAt(i);
//            if(c=='1'){
//                b=b+'0';
//            }
//            else{
//                b=b+'1';
//            }
//        }
//        return b;
//    }
//    public char findKthBit(int n, int k) {
//        String s="0";
//        //it is s1 write now
//        if(n==1){
//            return s.charAt(0);
//        }
//        String prev=s;
//        for(int i=2;i<=n;i++){
//            s=prev+"1"+reverse(invert(prev));
//            prev=s;
//        }
//        return s.charAt(k);
//    }
//}

