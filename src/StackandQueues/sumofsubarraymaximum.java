package StackandQueues;

import java.util.Stack;

class Solution {

    public int[] nextgreater(int[] arr){
        int[] a=new int[arr.length];
        Stack<Integer> ans=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while((!ans.isEmpty()) && (arr[ans.peek()]<=arr[i])){
                ans.pop();
            }
            if(ans.isEmpty()){
                a[i]=arr.length;
            }
            else{
                a[i]=ans.peek();
            }
            ans.push(i);
        }
        return a;
    }
    public int[] previousgreater(int[] arr){
        int[] a=new int[arr.length];
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while((!ans.isEmpty()) && (arr[ans.peek()]<=arr[i])){
                ans.pop();
            }
            if(ans.isEmpty()){
                a[i]=-1;
            }
            else{
                a[i]=ans.peek();
            }
            ans.push(i);
        }
        return a;
    }
    public int sumOfMax(int[] arr) {
        int[] prevgreater=previousgreater(arr);
        int[] nextgreater=nextgreater(arr);
        int mod=(int)Math.pow(2,31);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int left=i-prevgreater[i];
            int right=nextgreater[i]-i;
            long value=(left*right)%mod;
            sum=(sum+(int)(value*arr[i]))%mod;
        }
        return sum;
    }
}