class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            //I'm in left sorted part
            if (nums[mid] == target) return mid;
            else if (nums[mid]>=nums[start]) {
                if (target>=nums[start] && target<=nums[mid]) end = mid-1;
                else start = mid+1;
            } 
            //I'm in right sorted part
            else {
                if (target>=nums[mid] && nums[end]>=target) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}