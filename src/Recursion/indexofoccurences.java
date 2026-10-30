package Recursion;
//
//import java.util.Arrays;
//class Main {
//    public int[] occurence(int[] arr,int idx,int x, int fsf){
//        if(idx==arr.length){
//            return new int[fsf]; //create new array of size fsf when we reached the end of array and now we have to flow backward to store index of occurences
//        }
//        if(arr[idx]==x){
//            int[] b=occurence(arr,idx+1,x,fsf+1); //to increase size of array and have 0 in element of index(this step happen when stack flows upward)
//            b[fsf]=idx; //store the index of target occurence
//            //this step happens when stack flows downwards
//            return b;
//        }
//        else{
//            int[] b=occurence(arr,idx+1,x,fsf);
//            return b;
//        }
//    }
//    public static void main(String[] args) {
//        int[] a={3,43,1,2,21,3,3,5,6,7,3};
//        Main obj=new Main();
//
//        System.out.println(Arrays.toString(obj.occurence(a,0,3,0))); //if we directly print it will print address of array
//
//    }
//}

import java.util.Arrays;

class indexofoccurences{
    public static int[] indexof(int[] arr,int idx,int x,int fsp) //initially the size of array is 0 fsp so if element is found in that array so fsp will increase
    {

        if(arr.length==idx){
            return new int[fsp]; //at the end fsp is zero after then it increases
        }
        if(arr[idx]==x){
            int[] b=indexof(arr,idx+1,x,fsp+1);
            b[fsp]=idx; // at that fsp store the index
            return b;
        }
        else{
            int[] b=indexof(arr,idx+1,x,fsp);
            return b;
        }
    }

    public static void main(String[] args) {
        indexofoccurences obj=new indexofoccurences();
        int[] arr={1,2,3,54,1,1,1,3,2,1,2};
        System.out.println(Arrays.toString(indexof(arr,0,1,0)));
    }
}