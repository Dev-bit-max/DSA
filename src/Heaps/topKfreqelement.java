package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();

        for(int c:nums) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> ans=new PriorityQueue<>((b,c) -> Integer.compare(a.get(b),a.get(c)));

        for(int x:a.keySet()){
            ans.add(x);
            if(ans.size()>k){
                ans.poll();
            }
        }
        int[] finalans=new int[k];
        int i=0;
        while(!ans.isEmpty()){finalans[i++]=ans.poll();}
        return finalans;

    }
}
