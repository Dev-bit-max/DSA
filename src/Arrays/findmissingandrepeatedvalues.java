package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ans.put(grid[i][j],ans.getOrDefault(grid[i][j],0)+1);
            }
        }
        int[] a=new int[2];
        for(Map.Entry<Integer,Integer> map: ans.entrySet()){
            if(ans.containsValue(2)){
                a[0]=map.getKey();
            }
            if(ans.containsValue(0)){
                a[1]=map.getKey();
            }
        }
        return a;
    }
}



class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] a=new int[grid.length*grid.length];
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }//0th index

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                a[grid[i][j]-1]++;
            }
        }

        int[] ans=new int[2];
        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                ans[0]=i+1;
            }
            else if(a[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
