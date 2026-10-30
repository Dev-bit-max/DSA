package StackandQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> a= new ArrayList<>();
        for(int aa:baskets)
            a.add(aa);
        int count=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<a.size();j++){
                if(fruits[i]<a.get(j)){
                    count--;
                    a.remove(j);
                    break;
                }
            }
        }
        return count;
    }
}
