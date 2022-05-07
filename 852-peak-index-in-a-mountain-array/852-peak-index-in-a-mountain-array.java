class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length==1) return arr[0];
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (mid!=0 && mid!=arr.length-1 && arr[mid+1]<arr[mid] && arr[mid-1]<arr[mid]) return mid;
            else if (arr[mid+1]>arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}