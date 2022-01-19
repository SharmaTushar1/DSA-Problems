class Solution {
    public void sortColors(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        while (mid<=hi) {
            switch (arr[mid]) {
            case 0: 
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                mid++; lo++;
                break;
            case 1: mid++;
                break;
            case 2:
                int temp2 = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp2;
                hi--;
                break;
        }
        }
    }
}