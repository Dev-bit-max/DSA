package StackandQueues;

import java.util.Stack;

class Solution {
    public int[] previoussmallerelement(int[] arr) {
        Stack<Integer> a = new Stack<>();
        int[] smallerprev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while ((!a.isEmpty()) && (arr[a.peek()] >= arr[i])) {
                a.pop();
            }
            if (a.isEmpty()) {
                smallerprev[i] = -1;
            } else {
                smallerprev[i] = a.peek();
            }
            a.push(i);
        }
        return smallerprev;
    }

    public int[] nextsmaller(int[] arr) {
        Stack<Integer> a = new Stack<>();
        int[] nextsmall = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while ((!a.isEmpty()) && (arr[a.peek()] >= arr[i])) {
                a.pop();
            }
            if (a.isEmpty()) {
                nextsmall[i] = arr.length;;
            } else {
                nextsmall[i] = a.peek();
            }
            a.push(i);
        }
        return nextsmall;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] nextsmall=nextsmaller(arr);
        int[] prevsmall=previoussmallerelement(arr);
        int sum=0;
        int mod=(int)(Math.pow(10,9)+7);
        for(int i=0;i<arr.length;i++)
        {
            int ps=prevsmall[i];
            int ns=nextsmall[i];


            int left=i-ps;
            int right=ns-i;
            long freq=(left*right*1L)%mod;
            int val=(int)(freq*arr[i])%mod;
            sum=(sum+val)%mod;
        }
        return (int)sum;
    }
}
