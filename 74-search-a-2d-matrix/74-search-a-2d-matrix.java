class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int N = mat.length, M = mat[0].length;
        int start = 0, end = N*M-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mat[mid/M][mid%M]==target)
                return true;
            else if (mat[mid/M][mid%M]<target)
                start =  mid+1;
            else end = mid-1;
        }
        return false;
    }
}