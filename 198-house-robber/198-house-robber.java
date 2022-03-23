class Solution {
    public int rob(int[] nums) {
        int loot1 = 0;
        int loot2 = 0;
        for (int i = 0; i<nums.length; i++) {
            int totalLoot = Math.max(nums[i]+loot1, loot2);
            loot1 = loot2;
            loot2 = totalLoot;
        }
        return loot2;
    }
}