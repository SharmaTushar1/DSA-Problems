class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            if (h.containsKey(target-nums[i])) {
                arr[1] = i;
                arr[0] = h.get(target-nums[i]);
                break;
            }
            h.put(nums[i], i);
        }
        return arr;
    }
}