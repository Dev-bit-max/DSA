package Recursion;

public class firstoccurence {
    public static int firstocc(int[] arr,int idx,int x){
        if(x==arr[idx]){
            return idx;
        }
        int ans=firstocc(arr,idx+1,x);
        return  ans;
    }

    public static void main(String[] args) {
        firstoccurence obj=new firstoccurence();
        int[] arr={2,5,1,1};
        System.out.println(firstocc(arr,0,1));
    }
}
