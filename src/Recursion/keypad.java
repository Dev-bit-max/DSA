import java.util.ArrayList;
import java.util.List;

//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Main {
//    //    Map<Character, String> map = new HashMap<>();{
////        map.put('2', "abc"); //cannot directly call this inside fnc you need to initialise this inside constructor or blocker
////        map.put('3', "def");
////        map.put('4', "ghi");
////        map.put('5', "jkl");
////        map.put('6', "mno");
////        map.put('7', "pqrs");
////        map.put('8', "tuv");
////        map.put('9', "wxyz");
//    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//    public List<String> letterCombinations(String digits) {
//        if(digits.length()==0){
//            return new ArrayList<>();
//        }
//        return
//    }
////    public List<String> helper(String digits){
////        if(digits.length()==0){
////            List<String> a=new ArrayList<>();
////            a.add("");
////            return a;
////        }
////        char c=digits.charAt(0);
////        String rem=digits.substring(1);
////        List<String> rrem=helper(rem); //faith hai ki previous answers isme save rahege
////        List<String> fans=new ArrayList<>();
////        //String q=map.get(c);
////        String q=map[c-'0'];
////        for(int i=0;i<q.length();i++){
////            char e=q.charAt(i);
////            for(String str:rrem){
////                fans.add(e+""+str);
////            }
////        }
////        return fans;
//    }
//    public void printallkeypad(String digits,String ans) {
//    if(digits.length()==0){
//        System.out.println("");
//    }
//    char c=digits.charAt(0);
//    digits=digits.substring(1);
//    String a=map[c-'0'];
//    for(int i=0;i<a.length();i++){
//        char d=a.charAt(i);
//    printallkeypad(digits,ans+d);
//    }
//    }
class keypad{
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
public static List<String> lettercombo(String digits){
    if(digits.length()==0){
        List<String> b=new ArrayList<>();
        b.add("");
        return b;
    }
    char c=digits.charAt(0);
    String rem=digits.substring(1);
    List<String> ans=lettercombo(rem);
    List<String> a=new ArrayList<>();
    String ann=map[c-'0'];
    for(int i=0;i<ann.length();i++){
        char d=ann.charAt(i);
        for(String anns:ans)
        a.add(d+anns);
    }
    return a;
}

public static void main(String[] args) {
        Main obj=new Main();
    System.out.println(lettercombo("44"));
    }
}