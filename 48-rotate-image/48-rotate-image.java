class Solution {
    public void rotate(int[][] matrix) {
        //find the transpose
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i =0; i<m; i++) {
            for (int j = i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] a: matrix)
            System.out.println(Arrays.toString(a));
        //reverse
        for (int i = 0; i<m; i++) {
            int start =0, end = n-1;
            while (start<end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}