class Solution {
    public int maxSubArray(int[] nums) {
        int sum =Integer.MIN_VALUE, cur =0;
        for (int num: nums) {
            cur+=num;
            sum = Math.max(sum, cur);
            cur = cur<0?0:cur;
        }
        return sum;
    }
}