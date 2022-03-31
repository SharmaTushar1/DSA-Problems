class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int loot1 = houseRobberI(Arrays.copyOfRange(nums, 0, nums.length-1));
        int loot2 = houseRobberI(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(loot1, loot2);
    }
    
    public int houseRobberI(int[] nums) {
        int loot1 = 0;
        int loot2 = 0;
        for (int i = 0; i<nums.length; i++) {
            int loot = Math.max(loot2, loot1+nums[i]);
            loot1 = loot2;
            loot2 = loot;
        }
        return loot2;
    }
}