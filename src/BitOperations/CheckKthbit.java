package BitOperations;

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        String a="";
        int b=n;
        while(b!=1){
            a=a+b%2;
            b=b/2;
        }
        a=a+'1';
        StringBuilder c=new StringBuilder(a);
        c=c.reverse();
        if(c.charAt(c.length()-k)=='1'){
            return true;
        }
        return false;
    }
}
