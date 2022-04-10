class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        int maxSeq = 1, count = 1;
        for (int i = 0; i<nums.length; i++) set.add(nums[i]);
        for (int i = 0; i<nums.length; i++) {
            count = 1;
            if (!set.contains(nums[i]-1)) {
                while (set.contains(nums[i]+1)) {
                    count++;
                    nums[i]++;
                }
            }
            maxSeq = Math.max(count, maxSeq);
        }
        return maxSeq;
    }
}