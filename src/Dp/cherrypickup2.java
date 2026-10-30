package Dp;

import java.util.Arrays;

class Solution {
    int[][][] dp;
    public int max(int[][] grid,int i,int j1,int j2){

        if(i<0 || i>=grid.length || j1<0 || j2<0|| j1>=grid[0].length || j2>=grid[0].length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }

        if(i == grid.length - 1) {
            if(j1 == j2) {
                return grid[i][j1];
            }
            return grid[i][j1] + grid[i][j2];
        }


        int cherries;

        if(j1 == j2) {
            cherries = grid[i][j1];
        }
        else {
            cherries = grid[i][j1] + grid[i][j2];
        }
        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){

            for(int dj2=-1;dj2<=1;dj2++){


                maxi=Math.max(maxi,max(grid,i+1,j1+dj1,j2+dj2));

            }
        }



        return dp[i][j1][j2]=cherries+maxi;



    }

    public int cherryPickup(int[][] grid) {
        int rows=grid.length;
        int j1=0;
        int j2=grid[0].length-1;
        int i=0;
        for(int[][] row1 : dp) {
            for(int[] row2 : row1) {
                Arrays.fill(row2, -1);
            }
        }
        return max(grid,i,j1,j2);
    }
}
