package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=profit.length;
        Integer[] j=new Integer[profit.length];
        for(int i=0;i<n;i++){
            j[i]=i;
        }

        Arrays.sort(j,(a,b) -> Integer.compare(profit[b],profit[a]) );
        int maxdeadline=0;
        for(int i=0;i<n;i++){
            maxdeadline=Math.max(maxdeadline,deadline[i]);
        }
        int[] q=new int[maxdeadline];
        Arrays.setAll(q,i->-1); //set all takes fnc to set value not directly the value
        int cnt=0;
        int cntprofit=0;
        for(int k=0;k<n;k++){
            int idxjob=j[k];
            int profit1=profit[idxjob];
            int deadline1=deadline[idxjob];
            int d=deadline[idxjob]-1;
            if(q[d]==-1){
                cntprofit=cntprofit+profit1;
                cnt++;
                q[d]=0;
            }
            else{
                int idx=d;
                while(idx>=0){

                    if(q[idx]==-1){cntprofit=cntprofit+profit1;
                        cnt++;
                        q[idx]=0;
                        break;
                    }idx--;
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(cnt,cntprofit));
    }
}
//tc=O(n*n)
//sc=O(maxdeadline);