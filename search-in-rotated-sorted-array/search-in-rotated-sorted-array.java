class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            //left half is sorted
            if (nums[mid]>=nums[start]) {
                if (target>=nums[start] && nums[mid]>=target) end = mid-1;
                else start = mid+1;
            } else {
                if (nums[end]>=target && nums[mid]<=target) start = mid+1;
                else end = mid-1;
            }
        }
            return -1;
    }
}