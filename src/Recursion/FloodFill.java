package Recursion;

import java.util.Scanner;

public class FloodFill {

    public void tlrd(int[][] arr,int row,int col,String ans,boolean[][] a) {
        if(row<0 || col<0  || row==arr.length  || col==arr[0].length  || a[row][col]==true)
        {return;}
        if(row==arr.length-1 && col==arr[0].length){
            System.out.println(ans);
        }
        a[row][col]=true;
        tlrd(arr,row-1,col,ans+"t",a);
        tlrd(arr,row,col-1,ans+"l",a);
        tlrd(arr,row,col+1,ans+"r",a);
        tlrd(arr,row+1,col,ans+"d",a);
        a[row][col]=false;
    }

    public static void main(String[] args) {
        FloodFill obj=new FloodFill();
        int[][] arr=new int[4][4];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=in.nextInt();

            }
        }
        boolean[][] a=new boolean[arr.length][arr[0].length];
        obj.tlrd(arr,0,0,"",a);
    }
    }
