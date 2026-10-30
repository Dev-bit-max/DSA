package BitOperations;

import java.util.ArrayList;

class Solution {
    public static boolean checkprime(int i){
        for(int j=2;j*j<i;j++){
            if(i%j==0){return false;}
        }
        return true;
    }
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                if(checkprime(i)){
                if(!a.contains(n%i)){a.add(i);}}
            }
        }
        return a;
    }
}
