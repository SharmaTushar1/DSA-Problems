class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while (i<matrix.length && j>=0) {
            int start = matrix[i][j];
            if (target == start) return true;
            else if (target>start) i++;
            else j--;
        }
        return false;
    }
}