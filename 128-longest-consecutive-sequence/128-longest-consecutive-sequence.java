class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        Arrays.sort(nums);
        int maxSeq = 1;
        int count = 1;
        for (int i = 1; i<nums.length; i++) {
            if (nums[i-1]+1 == nums[i]) count++;
            else if (nums[i-1]==nums[i]) continue;
            else {
                maxSeq = Math.max(maxSeq, count);
                count = 1;
            }
        }
        return Math.max(count, maxSeq);
    }
}