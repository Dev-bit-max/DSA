package Recursion;

import java.util.ArrayList;

//package Recursion;
// read question first carefully
//You are given a matrix having n rows and m columns. The special property of this matrix is that some of the cells of this matrix are given as input, which are blocked i.e. they cannot be reached. Now you have to start from the cell (1,1) and reach the end (n,m) provided during the journey you can move horizontally right from the current cell or vertically down from the current cell. Returns total number of ways modulo 109 + 7 you can traverse the matrix obeying the above constraints starting from (1,1) and ending at (n,m).
//
//
//Example 1:
//
//Input: n = 3, m = 3, k = 2,
//blocked_cells = {{1,2},{3,2}}.
//Output: 1
//Explanation: There is only one path from
//        (1,1) to(3,3) which is (1,1)->(2,1)->(2,2)->
//        (2,3)->(3,3).
//Example 2:
//
//Input: n = 5, m = 5, k = 1,
//blocked_cells = {{5,5}}
//Output: 0
//Explanation: There is no path to reach at
//        (5,5) beacuse (5,5) is blocked.
class Mazepathproblem {
//    public int FindWays(int n, int m, int[][] blocked_cells) {
//        return findways(1,1,n,m,blocked_cells);
//    }
//    public int findways(int r,int c,int n,int m,int[][] blocked_cells){
//        if(r>n  || c>m){ //base case
//            return 0;
//        }
//        for(int i=0;i<blocked_cells.length;i++){ //will be given
//            //if the path exist in blocked cases then we will just not use that case
//            //return 0
//            if(blocked_cells[i][0]==r && blocked_cells[i][1]==c){
//                return 0;
//            }
//        }
//        //if it reached the destination (n,m) then it will return pathways=+1;
//        {if(r==n && c==m ){
//            return 1;
//        }
//        }
//        int pathrow=findways(r+1,c,n,m,blocked_cells);
//        int pathcolumn=findways(r,c+1,n,m,blocked_cells);
//        return pathrow+pathcolumn;
//    }
    public void printmazepath(int rs,int cs,int tr,int tc,String ans){
        if(tc==cs && tr==rs){
            System.out.println(ans);
            return;
        }
        if(tc<cs|| tr<rs){
            return;
        }
        printmazepath(rs+1,cs,tr,tc,ans+"v");
        printmazepath(rs,cs+1,tr,tc,ans+"h");
    }

    public static void main(String[] args) {
        Mazepathproblem obj=new Mazepathproblem();
        obj.printmazepath(1,1,3,3,"");
    }
}
