class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0, minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0) return 0;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while (!q.isEmpty()) {
            ++minutes;
            int size = q.size();
            for (int i = 0; i<size; i++) {
                int[] cur = q.poll();
                for (int j =0; j<4; j++) {
                    int x = cur[0]+dirs[j][0];
                    int y = cur[1]+dirs[j][1];
                    if (x<0 || y<0 || y>=n || x>=m || grid[x][y]==0 || grid[x][y] == 2) 
                        continue;
                    grid[x][y] = 2;
                    q.add(new int[]{x, y});
                    freshOranges--;
                }
            }
        }
        return freshOranges==0?minutes-1:-1;
    }
}