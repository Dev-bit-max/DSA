package DailyProblems;

class Solution {
    public int minOperations(int[] nums, int[] target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int difference=nums[i]-target[i];
            if(difference!=0){

                count++;
                for(int j=i;j<nums.length;j++){
                    if((target[j]+difference)!=nums[j]){
                        i=j-1;
                        break;
                    }
                }
            }
        }
        return count;
    }
}