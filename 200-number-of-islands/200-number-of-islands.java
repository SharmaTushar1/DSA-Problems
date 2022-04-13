class Solution {
    public int numIslands(char[][] grid) {
        int totalIslands = 0;
        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    totalIslands++; 
                    dfs(grid, i, j);
                }
            }
        }
        return totalIslands;
    }
    
    public void dfs(char[][] grid, int i, int j) {
        if (i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        dfs(grid, i+1, j);
    }
    
}