class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int num: nums) hash.put(num, hash.getOrDefault(num, 0)+1);
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> set : hash.entrySet()) {
            heap.add(set);
        }
        int[] arr = new int[k];
        for (int i =0; i<k; i++) {
            arr[i] = heap.poll().getKey();
        }
        return arr;
    }
}