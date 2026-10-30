package Recursion;


import java.util.ArrayList;
import java.util.List;

class PartitionPalindrome {
    public boolean ispalindrome(String x) {
        String a = x.substring(0, x.length() / 2);
        String b = "";
        if (x.length() % 2 == 1) {
            b = x.substring(x.length() / 2 + 1, x.length());
        } else {
            b = x.substring(x.length() / 2, x.length());
        }
        StringBuilder z = new StringBuilder(b);
        z.reverse();
        b = z.toString();
        return a.equals(b);
    }

    public void party(String s, List<String> temp, List<List<String>> result, int idx) {
        if(idx==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String a=s.substring(idx,i+1);
            if(ispalindrome(a)){
                temp.add(a);
                party(s,temp,result,i+1);
                temp.remove(temp.size()-1);
            }
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> a = new ArrayList<>();
        party(s, new ArrayList<>(), a, 0);
        return a;
    }
}
