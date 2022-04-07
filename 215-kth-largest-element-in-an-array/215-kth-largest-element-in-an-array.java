class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int num: nums) {
            maxHeap.add(-num);
        }
        while (k>1) {
            maxHeap.remove();
            k--;
        }
        return -maxHeap.remove();
    }
}