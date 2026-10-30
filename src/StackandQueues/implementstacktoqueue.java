package StackandQueues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> ans=new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        ans.add(x);
        int s=ans.size();
        for(int i=1;i<s;i++){
            ans.add(ans.peek());
            ans.poll();
        }
    }

    public int pop() {

        return ans.poll();
    }

    public int top() {
        int a=ans.peek();
        return a;
    }

    public boolean empty() {
        return ans.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
