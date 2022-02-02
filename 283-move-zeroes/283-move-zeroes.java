class Solution {
    public void moveZeroes(int[] arr) {
        
        int i = 0, j =0;
        
        while (i<arr.length && j<arr.length) {
            if (arr[i] == 0) i++;
            else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        
    }
    
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}