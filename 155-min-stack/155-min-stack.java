class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.add(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.add(val);
        if (val<minStack.peek()) minStack.add(val);
        else minStack.add(minStack.peek());
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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