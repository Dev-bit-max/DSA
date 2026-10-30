package Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m;
        int b=n;
        int[] nums=new int[nums1.length];
        nums=nums1;
        int c=0; //for nums
        int i=0,j=0;
        while(c<m && j<n){
            if(nums[c]>nums2[j]){
                nums1[i++]=nums2[j++];
            }
            else{
                nums1[i++]=nums[c++];
            }
        }
        while(c<m){
            nums1[i++]=nums[c++];
        }
        while(j<n){
            nums1[i++]=nums2[j++];
        }
    }
}
