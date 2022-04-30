class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if (arr[mid] == target) return mid;
            //Unsorted part (Right part is sorted)
            if (arr[mid]<arr[start]) {
                if (arr[mid]<target && arr[end]>=target) { //also make sure if it's inside that sorted part
                    start = mid+1;
                } else end = mid-1;
            } 
            //Sorted part (left part is sorted)
            else {
                if (arr[mid]>target && target>=arr[start]) end = mid-1;
                else start = mid+1;
            }      
        }
        return arr[end]==target?end:-1;
    }
}