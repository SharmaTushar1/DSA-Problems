class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length-1;
        while (k>1) {
            n--;
            k--;
        }
        return nums[n];
    }
}