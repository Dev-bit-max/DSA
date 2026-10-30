package GreedyAlgo;

import java.util.Arrays;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        Integer[] idx=new Integer[finish.length];

        Arrays.sort(idx,(a,b) -> Integer.compare(finish[a],finish[b]));
        int lastend=-1;
        int count=0;
        for(int j=0;j< finish.length;j++){
            int a=idx[j];
            int start1=start[a];
            int finish1=finish[a];
            if(lastend<start1){
                count++;
                lastend=finish1;
            }
        }
        return count;
    }
}
