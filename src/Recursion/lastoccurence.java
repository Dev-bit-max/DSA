package Recursion;

public class lastoccurence {
    public static int lastocc(int[] arr,int idx,int x){
        if(idx==arr.length){return -1;}
        int ans=lastocc(arr,idx+1,x);
        if(ans==-1){
            if(arr[idx]==x){return idx;}
            else{return -1;}
        }
        else{return ans;}
    }

    public static void main(String[] args) {
        lastoccurence obj=new lastoccurence();
        int[] arr={1,1,2,1};
        System.out.println(lastocc(arr,0,3  ));
    }
}
