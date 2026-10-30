package Recursion;

import java.util.*;
public class subsetsum1 {
    public static void subsetsum(int[] arr,int idx,int sum,List<Integer> temp){
        if(idx==arr.length){
            temp.add(sum);
            return;
        }
        subsetsum(arr,idx+1,sum+arr[idx],temp);

        subsetsum(arr,idx+1,sum,temp);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> ans=new ArrayList<>();
        subsetsum(arr,0,0,ans);
        System.out.println(ans);
    }
}
