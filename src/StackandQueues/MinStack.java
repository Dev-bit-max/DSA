package StackandQueues;

import java.util.Stack;

class MinStack {
    Stack<int[]> s;
    int min;
    public MinStack() {
        s=new Stack<>();
        min=Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(s.isEmpty()){
            s.push(new int[]{val,val});
        }
        min=Math.min(min,getMin());
        s.push(new int[]{val,min});
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek()[0];
    }

    public int getMin() {
        return s.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
