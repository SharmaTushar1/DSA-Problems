class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        // HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) map.put(nums[i], i);
        // for (int num: nums) set.add(num);
        for (int[] operation: operations) {
            if (map.containsKey(operation[0])) {
                int index = map.get(operation[0]);
                map.remove(operation[0]);
                map.put(operation[1], index);
            }
        }
        for (Map.Entry<Integer, Integer> set: map.entrySet()) {
            nums[set.getValue()] = set.getKey();
        }
        return nums;
    }
}