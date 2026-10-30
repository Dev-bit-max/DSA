package StackandQueues;

import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] a=new int[matrix.length][matrix[0].length];
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<col;i++){
            int prefixsum=0;
            for(int j=0;j<row;j++){
                int c=(int)(matrix[j][i]-'0');
                if(c==1){
                    prefixsum+=c;
                    a[j][i]=prefixsum;
                }
                else{
                    prefixsum=0;
                    a[j][i]=0;
                }
            }
        }

        int maxrect=0;

        for(int r=0;r<row;r++){
            Stack<Integer> ans=new Stack<>();
            int[] s=new int[col];
            for(int k=0;k<col;k++){s[k]=a[r][k];}
            for(int c=0;c<col;c++){
                int index=c;
                while(!ans.isEmpty() && s[ans.peek()]>s[c]){
                    int currentheight=s[ans.pop()];
                    int width;
                    if(ans.isEmpty()){width=index;}
                    else{width=index-ans.peek()-1;}

                    int area=currentheight*width;
                    maxrect=Math.max(maxrect,area);
                }
                ans.push(c);
            }
            while(!ans.isEmpty()){
                int currindex=ans.pop();
                int nse= col;
                int pse;
                if(ans.isEmpty()){pse=-1;}
                else{pse=ans.peek();}
                int height=s[currindex];
                int width=nse-pse-1;
                int area=height*width;
                maxrect=Math.max(maxrect,area);
            }

        }


        return maxrect;



    }
}
