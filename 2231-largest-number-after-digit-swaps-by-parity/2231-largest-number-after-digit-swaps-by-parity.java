class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> oddHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int size = 0;
        int temp = num;
        while (num!=0) {
            num /= 10;
            size++;
        }
        num = temp;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<size; i++) {
            list.add(temp%10);
            temp /= 10;
        }
        
        Collections.reverse(list);
        
        for (int i = 0; i<size; i++) {
            if (list.get(i)%2 == 0) evenHeap.add(list.get(i));
            else oddHeap.add(list.get(i));
        }
        
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i<size; i++) {
            if (list.get(i)%2 == 0) {
                sb.append(evenHeap.remove());
            } else {
                sb.append(oddHeap.remove());
            }
        }
        return Integer.parseInt(sb.toString());
        
    }
}