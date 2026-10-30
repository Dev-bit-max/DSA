package GreedyAlgo;

import java.util.Arrays;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int lastend=-1;
        int c=0;
        Integer[] idx=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            idx[i]=i;
        }
        Arrays.sort(idx, (a,b) -> arr[a]-arr[b]);
        int max=Integer.MIN_VALUE;
        for(int i:idx){
            if(lastend<arr[i]){
                c=1;
                lastend=dep[i];
            }
            else if(lastend>=arr[i]){
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}

