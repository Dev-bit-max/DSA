package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i:nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> check = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a[1], b[1]);
        });

        for(int i:ans.keySet()){
            check.add(new int[]{i,ans.get(i)});
        }
        int[] finalans=new int[nums.length];
        int i=0;
        while(!check.isEmpty()){
            int no=check.peek()[0];
            int nooftimes=check.poll()[1];
            for(int j=0;j<nooftimes;j++){
                finalans[i++]=no;
            }
        }
        return finalans;

    }
}
