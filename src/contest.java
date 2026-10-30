import java.util.HashMap;

class Solution {
    public int checkduplicate(int s,int[] nums){
        int c=0;
        for(int i=s;i<nums.length;i++){
            
        }
    }
    public int minOperations(int[] nums) {
        if(nums.length<=3){return 1;}
        int i=3;
        int steps=1;
        while(i<=nums.length){
            if(checkduplicate(i,nums)==1){
                i=i+3;
                steps++;
            }
            else if(checkduplicate(i,nums)==0){break;}

        }
        return steps;
    }
}
