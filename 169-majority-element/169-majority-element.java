class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        for (Map.Entry<Integer, Integer> set: map.entrySet()) {
            if (set.getValue()>nums.length/2)
                return set.getKey();
        }
        return -1;
    }
}