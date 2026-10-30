package DailyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public boolean sorted(List<Integer> ans){
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
        }
        int op = 0;
        int index = 0;

        while (!sorted(ans)) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                int sum = ans.get(j) + ans.get(j + 1);
                if (sum < min) {
                    min = sum;
                    index = j;
                }
            }
            op++;
            int merged = ans.get(index) + ans.get(index + 1);
            ans.set(index, merged);
            ans.remove(index + 1);
        }
        return op;
    }
}
