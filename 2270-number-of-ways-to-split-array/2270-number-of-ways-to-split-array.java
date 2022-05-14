class Solution {
    public int waysToSplitArray(int[] nums) {
        long rSum = 0;
        for (int num: nums) rSum += num;
        long lSum = 0;
        int ans = 0;
        System.out.println(rSum);
        for (int i = 0; i<nums.length-1; i++) {
            lSum += nums[i];
            rSum -= nums[i];
            if (lSum>=rSum) ans++;
        }
        return ans;
    }
}