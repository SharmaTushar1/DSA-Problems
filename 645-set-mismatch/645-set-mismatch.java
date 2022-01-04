class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] arr1 = new int[2];
        int n = arr.length;
        
        int j = 0;
        while (j<n) {
            int correct = arr[j]-1;
            if (arr[j]!=arr[correct]) {
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            } else j++;
        }
        
        for (int i =0; i<n; i++) {
            if (arr[i]!=i+1) {
                arr1[0] = arr[i];
                arr1[1]=i+1;
            }
        }
        return arr1;
    }
}