class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length; 
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOranges = 0;
        //add all the positions which are rotten
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if (grid[i][j]==2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        } 
        if (freshOranges == 0) return 0;
        //apply bfs algorithm
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int count = 0;
        while (!q.isEmpty()) {
            ++count;
            int size = q.size();
            for (int i = 0; i<size; i++) {
                int[] cur = q.poll();
                for (int j = 0; j<4; j++) {
                    int x = cur[0]+dirs[j][0];
                    int y = cur[1]+dirs[j][1];
                    if (x<0 || y<0 || x>=rows || y>=cols || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    q.add(new int[]{x, y});
                    freshOranges--;
                }
            }
        }
        return freshOranges==0?count-1:-1;
    }
}