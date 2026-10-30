package GreedyAlgo;

import java.util.Arrays;

//class Solution {
//    public int candy(int[] ratings){
//    int[] candy=new int[ratings.length];
//    int[] r=new int[ratings.length];
//    int sum=0;
//    int minval=1;
//        Arrays.fill(l,1);
//        Arrays.fill(r,1);
//        boolean updated=true;
//        while(updated){
//            updated=false;
//            for(int i=1;i< ratings.length;i++){
//                if(ratings[i]<ratings[i-1] && candy[i]<=candy[i-1]){
//                    candy[i]=candy[i-1]+1;
//                    updated=true;
//                }
//            }
//
//            for(int i= ratings.length-2;i>0;i--){
//                if(ratings[i]>ratings[i+1] && candy[i]<=candy[i+1]){
//                    candy[i]=candy[i+1]+1;
//                    updated=true;
//                }
//            }
//
//        }
//
//        for(int i=0;i<candy.length;i++){
//            sum=sum+candy[i];
//        }
//        return sum;
//}
//}

class Solution {
    public int candy(int[] ratings) {
        int sum=1;
        int i=1;
        int n=ratings.length;
        while(i<ratings.length){
            if(ratings[i]==ratings[i-1]){
                sum=sum+1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                sum=sum+peak;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){

                sum=sum+down;down++;
                i++;
            }
            if(down>peak){
                sum=sum+(down-peak);
            }
        }
        return sum;
    }
}