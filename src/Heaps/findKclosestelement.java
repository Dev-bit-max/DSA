package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> ans = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(b[1], a[1]);
            return Integer.compare(b[0], a[0]);
        });
        List<Integer> finalans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(new int[]{arr[i],(Math.abs(arr[i]-x))});
            if(ans.size()>k){
                ans.poll();
            }
        }
        while(!ans.isEmpty()){
            finalans.add(ans.poll()[0]);
        }
        Collections.sort(finalans);
        return finalans;
    }
}
