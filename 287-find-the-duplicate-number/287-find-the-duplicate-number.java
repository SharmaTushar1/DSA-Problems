class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        boolean first = true;
        while (first || slow!=fast) {
            if (first) first = false;
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = nums[0];
        while (slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

        