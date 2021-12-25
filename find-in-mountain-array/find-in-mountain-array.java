/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int index = peakElement(mountainArr);
        int ans = binarySearch(mountainArr, target, 0, index);
        if (ans == -1) ans = binarySearch(mountainArr, target, index+1, mountainArr.length()-1);
        return ans;
        
    }
    
    public int binarySearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
    public int peakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length()-1;
        int mid = -1;
        while (start<end) {
            mid = start + (end-start)/2;
            if (arr.get(mid)>arr.get(mid+1)) end = mid;
            else start = mid+1;
        }
        return start;
    }
    
}