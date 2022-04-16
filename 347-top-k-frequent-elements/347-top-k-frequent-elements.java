class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (int i =0; i<nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: hash.entrySet()) {
            q.add(entry);
        }
        int[] arr = new int[k];
        for (int i = 0; i<k; i++) {
            arr[i] = q.poll().getKey();
        }
        return arr;
    }
}