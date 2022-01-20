class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                ans[j][n-i-1] = matrix[i][j];
            }
        }
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}