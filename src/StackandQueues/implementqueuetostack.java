import java.util.Stack;

class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        s1.add(x);
    }

    public int pop() {
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public boolean empty() {
        if(s2.isEmpty()){return true;}
        return false;
    }
}
