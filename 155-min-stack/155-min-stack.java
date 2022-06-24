class MinStack {
    private Stack<Integer> stack;
    public Stack<Integer> minValues;
    
    public MinStack() {
        stack = new Stack<>();
        minValues = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty() || val<=minValues.peek()) {
            minValues.add(val);
        }
        stack.add(val);
    }
    
    public void pop() {
        // System.out.println(stack.peek());
        // System.out.println(minValues.m);
        
        if ((int)stack.peek()==(int)minValues.peek()) {
            // System.out.println("asdf");
            minValues.pop(); 
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValues.peek();
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