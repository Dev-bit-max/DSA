package StackandQueues;
//
//import java.util.Stack;
//
//class Solution {
//    public int[] nse(int[] heights){
//        Stack<Integer> ans=new Stack<>();
//        int[] a=new int[heights.length];
//        for(int i=heights.length-1;i>=0;i--){
//
//            while(!ans.isEmpty() && heights[ans.peek()]>=heights[i]){
//                ans.pop();
//            }
//            if(ans.isEmpty()){a[i]=heights.length-1;}
//            else{
//                a[i]=ans.peek();
//            }
//            ans.push(i);
//        }
//        return a;
//    }
//    public int[] pse(int[] heights){
//        Stack<Integer> ans=new Stack<>();
//        int[] a=new int[heights.length];
//        for(int i=0;i<heights.length;i++){
//
//            while(!ans.isEmpty() && heights[ans.peek()]>=heights[i]){
//                ans.pop();
//            }
//            if(ans.isEmpty()){a[i]=-1;}
//            else{
//                a[i]=ans.peek();
//            }
//            ans.push(i);
//        }
//        return a;
//    }
//
//
//
//
//    public int largestRectangleArea(int[] heights) {
//
//        int[] nse=nse(heights);
//        int[] pse=pse(heights);
//
//        int max=0;
//        for(int i=0;i<heights.length;i++){
//            int value=heights[i];
//            int left=i-pse[i]-1;
//            int right=nse[i]-i-1;
//            int z=value*(left+right);
//            max=Math.max(max,z);
//        }
//        return max;
//
//    }
//}


import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxvalue=0;

        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<=heights.length;i++){

           int currentheight=(i== heights.length)? 0:heights[i];
            while(!ans.isEmpty() && heights[ans.peek()]>currentheight){
                int currentindex=ans.pop();

                int height=heights[currentindex];
                int width;
                if(ans.isEmpty()){
                    width=i;
                }
                else{width=i-ans.peek()-1;}
                int area=height*width;
                maxvalue=Math.max(maxvalue,area);
            }
            if(i<heights.length){
            ans.push(i);}
        }

        while(!ans.isEmpty()){
            int currindex=ans.pop();
            int nse= heights.length;
            int pse;
            if(ans.isEmpty()){pse=-1;}
            else{pse=ans.peek();}
            int height=heights[currindex];
            int width=nse-pse-1;
            int area=height*width;
            maxvalue=Math.max(maxvalue,area);
        }
        return maxvalue;

    }
}
