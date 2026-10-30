import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s.toLowerCase();
        HashSet<Character> a=new HashSet<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        List<Character> b=new ArrayList<>(a);
        Collections.sort(b);
        StringBuilder z=new StringBuilder();
        for(int i=0;i<b.size();i++){
            z.append(b.get(i));
        }
            String result=z.toString();
        System.out.println(result);
    }
}