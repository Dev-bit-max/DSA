package Recursion;

public class factorial {
    public int facto(int f){
        if(f==0){return 1;}
        int a=facto(f-1);
        int ans=f*a;
        return ans;
    }
    public int power(int n,int pow) {
        if (pow == 0) {
            return 1;
        }


        if (pow < 0) {
            n = 1 / n;
            pow = -1 * pow;
        }



        int a = power(n, pow/ 2);
        if (pow % 2 == 0) {
            int ans = a*a;
            return ans;
        } else {
            int ans = a * a*n;
            return ans;
        }
    }
        public static void main (String[]args){
            factorial obj = new factorial();
            System.out.println(obj.power(2, -5));
        }
    }