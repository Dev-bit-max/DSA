package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> check=new PriorityQueue<>();


        for(int i=0;i<arr.length;i++){
            check.add(arr[i]);
            if(check.size()>k){check.poll();}
        }
        while(!check.isEmpty()){ans.add(check.poll());}
        Collections.reverse(ans);
        return ans;
    }
}
