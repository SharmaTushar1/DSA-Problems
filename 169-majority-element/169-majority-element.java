class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        for (Map.Entry<Integer, Integer> set: map.entrySet()) {
            if (set.getValue()>nums.length/2) return set.getKey();
        }
        return -1;
    }
}