package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class nextpermutation {

    public void ans(int[] nums, List<Integer> temp, List<List<Integer>> finalans, boolean[] check) {
        if (nums.length == temp.size()) {
            finalans.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            if (check[i] == false) {
                check[i] = true;
                temp.add(nums[i]);
                ans(nums, temp, finalans, check);
                temp.remove(temp.size() - 1);
                check[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        List<List<Integer>> a = new ArrayList<>();
        ans(nums, temp, a, check);
        return a;
    }


    public void nextPermutation(int[] nums) {
        int[] num=new int[nums.length];
        num=nums;
        Arrays.sort(num);
        List<List<Integer>> ans=permute(num);
        int j=0;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i).toArray().equals(nums) && i!=ans.size()-1){
                j=i;
                break;
            }
        }
        if(j!=ans.size()-1){
            List<Integer> a=ans.get(j+1);
            for(int i=0;i<nums.length;i++){
                nums[i]=a.get(i);
            }
        }
        else{
            List<Integer> a=ans.get(0);
            for(int i=0;i<nums.length;i++){
                nums[i]=a.get(i);
            }
        }

    }
    public static void main(String[] args) {
        nextpermutation a = new nextpermutation();
        int[] nums = {3,2,1};

        a.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
