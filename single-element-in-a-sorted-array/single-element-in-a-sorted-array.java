class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid%2 == 0) {
                if (mid>0 && (nums[mid-1]==nums[mid])) end = mid-1;
                else start = mid+1;
            } else {
                if (mid>0 && (nums[mid-1]==nums[mid])) start = mid+1;
                else end = mid-1;
            }
        }
        return nums[start-1];
    }
}