class MovingAverage {
    Deque<Integer> dq = new LinkedList<>();
    double sum = 0;
    int count = 0;
    int size;
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        dq.addLast(val);
        sum+=val;
        if (count>=size) {
            int first = dq.pollFirst();
            sum-=first;
            count--;
        } 
        count++;
        return sum/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */