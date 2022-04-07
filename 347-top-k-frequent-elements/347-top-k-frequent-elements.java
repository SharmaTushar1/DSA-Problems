class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num: nums) {
            hash.put(num, hash.getOrDefault(num,0)+1);//return 0 if no value present
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> set: hash.entrySet()) {
            maxHeap.add(set);
        }
        int[] arr = new int[k];
        for (int i = 0; i<k; i++) {
            arr[i] = maxHeap.remove().getKey();
        }
        return arr;
    }
}