package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    int maxLength(int arr[]) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            ans.put(i-1,sum);
            sum=sum+arr[i];
        }
        for(int i=0;i<ans.size();i++){
            int w=ans.get(i);

        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> a:ans.entrySet()){
            int q=ans.
        }

        List<Integer> b=new ArrayList<>();

        return b.getLast()-b.getFirst()-1;
    }
}