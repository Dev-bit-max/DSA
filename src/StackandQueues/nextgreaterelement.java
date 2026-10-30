import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> a=new Stack<>();
        for(int num:nums2){
            while((!a.isEmpty()) && (a.peek()<num)){
                map.put(a.pop(),num);}
            a.push(num);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }else {
                nums1[i] = -1;
            }
            }
        return nums1;
    }
}