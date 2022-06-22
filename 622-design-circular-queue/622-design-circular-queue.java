class MyCircularQueue {

    private int[] data;
    private int head = 0;
    private int tail = 0;
    private int k;
    
    public MyCircularQueue(int f) {
        data = new int[f+1];
        k = f+1;
    }
    
    public boolean enQueue(int value) {
        if ((tail+1)%k!=head) {
            data[(++tail)%k] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if (head%k==tail%k) return false;
        else {
            head=(head+1)%k;
        }
        return true;
    }
    
    public int Front() {
        if (head==tail) return -1;
        return data[(head+1)%k];
    }
    
    public int Rear() {
        if (head==tail) return -1;
        return data[tail%k];
    }
    
    public boolean isEmpty() {
        return tail==head;
    }
    
    public boolean isFull() {
        return (tail+1)%k==head; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */