class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int s = 0;
        int end = n-1;
        while (s<end) {
            int[] temp = matrix[s];
            matrix[s] = matrix[end];
            matrix[end] = temp;
            s++; end--;
        }   
        for (int i = 0; i<n; i++) {
            for (int j = i+1; j<m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}