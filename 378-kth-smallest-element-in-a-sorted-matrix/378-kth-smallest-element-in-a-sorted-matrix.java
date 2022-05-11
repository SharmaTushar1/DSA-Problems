class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[row-1][col-1];
        // System.out.println(end);
        while (start<end) {
            int count = 0;
            int mid = start+(end-start)/2;
            int j = col-1;
            for (int i = 0; i<row; i++) {
                while (j>=0 && matrix[i][j]>mid) j--;
                count += j+1;
            }
            if (count<k) start = mid+1;
            else end = mid;
        }
        return end;
    }
}