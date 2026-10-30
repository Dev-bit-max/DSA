class Solution {
    public long maximumScore(int[] nums) {
        long total=0;
        int prefix=0;
        int suffix=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefix=0;
                int j=i+1;
                while(j<nums.length){
                    suffix=suffix+nums[j];
                    j++;
                }
                total=Math.max(total,(prefix-suffix));
                prefix=0;
                suffix=0;
            }
            else if(i==nums.length-1){
                suffix=0;
                int j=0;
                while(j!=i-1){
                    prefix=prefix+nums[j];
                    j++;
                }
                total=Math.max(total,(prefix-suffix));
                prefix=0;
                suffix=0;
            }
            else{
                int j=0;
                while(j!=i-1){
                    prefix=prefix+nums[j];
                    j++;
                }
                int k=i+1;
                while(k<nums.length){
                    suffix=suffix+nums[k];
                    k++;
                }
                total=Math.max(total,(prefix-suffix));
                prefix=0;
                suffix=0;
            }
        }
        return total;
    }
}