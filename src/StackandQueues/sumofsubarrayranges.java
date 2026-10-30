import java.util.Stack;

class Solution {

    public int[] nextgreater(int[] nums){
        int[] a=new int[nums.length];
        Stack<Integer> ans=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while((!ans.isEmpty()) && (nums[ans.peek()]<nums[i])){
                ans.pop();
            }
            if(ans.isEmpty()){
                a[i]=nums.length;
            }
            else{
                a[i]=ans.peek();
            }
            ans.push(i);
        }
        return a;
    }
    public int[] previousgreater(int[] nums){
        int[] a=new int[nums.length];
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while((!ans.isEmpty()) && (nums[ans.peek()]<=nums[i])){
                ans.pop();
            }
            if(ans.isEmpty()){
                a[i]=-1;
            }
            else{
                a[i]=ans.peek();
            }
            ans.push(i);
        }
        return a;
    }
    public long sumOfMax(int[] nums) {
        int[] prevgreater=previousgreater(nums);
        int[] nextgreater=nextgreater(nums);

        long sum=0;
        for(int i=0;i<nums.length;i++){
            long left=i-prevgreater[i];
            long right=nextgreater[i]-i;
            long value=(long)(left*right);
            sum=(sum+(value*nums[i]));
        }
        return (long)sum;
    }

    public int[] previoussmallerelement(int[] nums) {
        Stack<Integer> a = new Stack<>();
        int[] smallerprev = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            while ((!a.isEmpty()) && (nums[a.peek()] >= nums[i])) {
                a.pop();
            }
            if (a.isEmpty()) {
                smallerprev[i] = -1;
            } else {
                smallerprev[i] = a.peek();
            }
            a.push(i);
        }
        return smallerprev;
    }

    public int[] nextsmaller(int[] nums) {
        Stack<Integer> a = new Stack<>();
        int[] nextsmall = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while ((!a.isEmpty()) && (nums[a.peek()] > nums[i])) {
                a.pop();
            }
            if (a.isEmpty()) {
                nextsmall[i] = nums.length;;
            } else {
                nextsmall[i] = a.peek();
            }
            a.push(i);
        }
        return nextsmall;
    }
    public long sumSubarrayMins(int[] nums) {
        int[] nextsmall=nextsmaller(nums);
        int[] prevsmall=previoussmallerelement(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            long ps=prevsmall[i];
            long ns=nextsmall[i];


            long left=i-ps;
            long right=ns-i;
            long freq=(left*right);
            long val=(long)(freq*nums[i]);
            sum=(sum+val);
        }
        return (long)sum;
    }

    public long subArrayRanges(int[] nums) {
        return sumOfMax(nums)-sumSubarrayMins(nums);
    }
}