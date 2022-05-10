class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) map.put(num, map.getOrDefault(num, 0)+1);
        int i = 0;
        if (map.containsKey(0)) {
            while (i<map.get(0)) {
                nums[i] = 0;
                i++;
            }
        }
        if (map.containsKey(1)) {
            int j = 0;
            while (j<map.get(1)) {
                nums[i++] = 1;
                j++;
            }
        }
        if (map.containsKey(2)) {
            int k = 0;
            while (k<map.get(2)) {
                nums[i++] = 2;
                k++;
            }
        }
    }
}