package Recursion;

import java.util.Arrays;

public class Recursivebubblesort {

        static void bubble_sort(int[] arr, int n) {
            //Base case: range == 1.
            if (n == 1) return;

            int didSwap = 0;
            for (int j = 0; j <= n - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }

            // if no swapping happens.
            if (didSwap == 0) return;

            //Range reduced after recursion:
            bubble_sort(arr, n - 1);

        }
        public void insertion(int[] arr,int n,int i){
            if(n==i){
                return;
            }
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            insertion(arr,n,i+1);
        }
    public static void main(String[] args) {
        int[] arr={5,1,4,2,0,2,4,21,3};
        Recursivebubblesort obj=new Recursivebubblesort();
       obj.insertion(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
}
