package Recursion;

import java.util.Stack;

/*Complete the function below*/
class GfG {
    public static void insert(int element, Stack<Integer> s){
        if(s.isEmpty() || s.peek()<=element){
            s.push(element);
            return;
        }
        int top=s.pop();
        insert(element,s);
        s.push(top);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty() || s.size()==1){
            return s;
        }
        int top=s.pop();
        sort(s);
        insert(top,s);
        return s;
    }
}