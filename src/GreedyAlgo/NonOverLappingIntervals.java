package GreedyAlgo;

import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1],b[1]));
        int lastseen=Integer.MIN_VALUE;
        int count=0;
        for(int[] m:intervals){
            if(lastseen>m[0]){
                count++;
            }
            else{
                lastseen=m[1];
            }
        }
        return count;
    }
}
