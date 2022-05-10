class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) map.put(num, map.getOrDefault(num, 0)+1);
        int i = 0;
        if (map.containsKey(0)) {
            for (int x = 0; x<map.get(0); x++) {
                nums[i++] = 0;
            }
        }
        if (map.containsKey(1)) {
            for (int y = 0; y<map.get(1); y++) {
                nums[i++] = 1;
            }
        }
        if (map.containsKey(2)) {
            for (int z = 0; z<map.get(2); z++) {
                nums[i++] = 2;
            }
        }
    }
}