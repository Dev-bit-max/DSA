package StackandQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> ans=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=arr.length;i>=0;i--){
            while((ans.isEmpty()) && ans.peek()>=arr[i]){
                ans.pop();
            }
            if(ans.isEmpty()){
                a.add(-1);
            }
            else {
                a.add(ans.peek());
            }
            ans.push(arr[i]);
        }
        Collections.reverse(a);
        return a;
    }
}
