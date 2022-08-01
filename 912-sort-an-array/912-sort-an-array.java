class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void mergeSort(int[] nums, int start, int end) {
        if (start>=end)
            return;
        int mid = start+(end-start)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid,  end);
    }
    
    public void merge(int[] nums, int start, int mid, int end) {
        int[] arr = new int[end-start+1];
        int i=start, j=mid+1, k=0;
        while (i<=mid && j<=end) {
            if (nums[i]<=nums[j])
                arr[k++] = nums[i++];
            else arr[k++] = nums[j++];
        } 
        while (i<=mid) arr[k++]=nums[i++];
        while (j<=end) arr[k++]=nums[j++];
        for (int x=start; x<=end; x++) {
            nums[x] = arr[x-start];
        }
    }
}