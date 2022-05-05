class MyQueue {
    
    Stack<Integer> st1;
    Stack<Integer> st2;
    
    public boolean useFirst;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>(); 
    }
    
    public void push(int x) {
        while (!st2.isEmpty()) st1.add(st2.pop());
        st1.add(x);
    }
    
    public int pop() {
        int size = st1.size();
        while (!st1.isEmpty()) st2.add(st1.pop());
        return st2.pop();
        
    }
    
    public int peek() {
        while (!st1.isEmpty()) st2.add(st1.pop());
        return st2.peek();
    }
    
    public boolean empty() {
        return (st1.isEmpty() && st2.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */