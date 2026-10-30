package Recursion;

class Solution {
    public int check(int row,int col,int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m){return 0;}

        if(grid[row][col]==0){return 0;}

        int value=grid[row][col];
        grid[row][col]=0;
        int up=check(row-1,col,grid);
        int down=check(row+1,col,grid);

        int left=check(row,col-1,grid);

        int right=check(row,col+1,grid);


        return up+down+left+right+value;


    }
    public int countIslands(int[][] grid, int k) {
        int total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int count=check(i,j,grid);
                if(count%k==0){total++;}
            }
        }

        return total;

    }
}