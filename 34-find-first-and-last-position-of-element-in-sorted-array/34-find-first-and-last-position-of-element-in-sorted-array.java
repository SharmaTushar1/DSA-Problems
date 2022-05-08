class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int[] arr = new int[]{-1, -1};
        arr[0] = leftMost(nums, target);
        arr[1] = rightMost(nums, target);
        return arr;
    }
    
    public int leftMost(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<end) {
            int mid = start + (end-start)/2;
            if (nums[mid]<target) start = mid+1;
            else end = mid;
        }
        if (end>=0 && nums[end]!=target) return -1;
        return end;
    }
    
    public int rightMost(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        if (end>=0 && nums[end]!=target) return -1;
        return end;
    }
    
}