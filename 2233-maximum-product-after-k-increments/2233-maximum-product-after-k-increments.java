class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num: nums) minHeap.add(num);
        while (k!=0) {
            int min = minHeap.remove();
            min++;
            minHeap.add(min);
            k--;
        }
        long product = 1;
        while (!minHeap.isEmpty()) {
            product = (product*minHeap.remove())%1000000007;
        }
        return (int) product;
    }
}