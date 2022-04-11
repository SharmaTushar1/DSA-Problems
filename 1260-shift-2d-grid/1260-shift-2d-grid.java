class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                int posIn1d = (n*i+j+k)%(m*n);
                int newRow = posIn1d/n;
                int newCol = posIn1d%n;
                arr[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i<m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j<n; j++) {
                row.add(arr[i][j]);
            }
            list.add(row);
        }
        return list;
    }
}