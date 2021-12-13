//link - https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i =0; i<n-1; i++) {
            for (int j = i+1; j<n; j++) {
                if (nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}
