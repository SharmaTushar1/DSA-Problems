class MyHashSet {
    private int[] arr;
    public MyHashSet() {
        arr = new int[1000001];
        for (int i = 0; i<=1000000; i++) arr[i] = -1;
    }
    
    public void add(int key) {
        arr[key] = 1;
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
    
    public boolean contains(int key) {
        return !(arr[key] == -1);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */