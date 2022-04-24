class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            maxHeap.add(m);
        }
        for (int i = 0; i<k; i++) {
            ans[i] = maxHeap.poll().getKey();
        }
        return ans;
    }
}