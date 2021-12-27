class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int i =0; i<n; i++) {
            for (int j = 0; j<grid[i].length; j++) {
                if (grid[i][j]<0) count++;
            }
        }
        return count;
    }
    
    // public int binarySearch(int[][] grid) {
    //     int count = 0;
    //     while ()
    // }
}