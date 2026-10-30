package HashMap;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            presum=presum+nums[i];
            if(a.containsKey(presum-k)){
                count=count+a.get(presum);
            }
            a.put(presum,a.getOrDefault(presum,0)+1);

        }
        return count;
    }
}
