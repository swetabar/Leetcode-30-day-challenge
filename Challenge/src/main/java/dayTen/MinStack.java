package dayTen;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(x < min) {
            min = x;
        }
        stack.push(x);
        stack.push(min);
    }

    public void pop() {

        stack.pop();
        int val = stack.pop();
        if(val == min) {
            if(stack.isEmpty()) {
                min = Integer.MAX_VALUE;
            } else
                min = stack.peek();
        }
    }

    public int top() {
        int valMin = stack.pop();
        int val = stack.peek();
        stack.push(valMin);
        return val;
    }

    public int getMin() {
        return stack.peek();
    }
}
