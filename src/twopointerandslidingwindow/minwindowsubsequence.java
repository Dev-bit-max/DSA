package twopointerandslidingwindow;

class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int i=0;
        int minlen=Integer.MAX_VALUE;
        int sindex=-1;
        int n=s1.length();
        int m=s2.length();
        while(i<n){
            int j=0;
            while(i<n){
                if(s1.charAt(i)==s2.charAt(j)){
                    j++;
                    if(j==m){break;}
                }
                i++;
            }//i will till the j satisfies at s1 min length

            if(j<m){break;} //no subsequence infront exist

            int end=i;//last part of s2(j)
            j=m-1;
            while(j>=0){

                if(s1.charAt(i)==s2.charAt(j)){

                    j--;

                }

                i--;

            }

            i++; //i goes extra one backward so for compensation

            if(end-i+1<minlen){

                minlen=end-i+1;

                sindex=i;

            }

            i++;

        }

        return sindex==-1 ? "":s1.substring(sindex,
                sindex+minlen);
    }
}

