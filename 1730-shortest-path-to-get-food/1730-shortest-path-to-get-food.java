class Solution {
    public int getFood(char[][] grid) {
        int[] me = new int[]{-1, -1};
        for (int i = 0; i<grid.length; i++) {
            for (int j =0; j<grid[0].length; j++) {
                if (grid[i][j]=='*') {
                    me[0] = i;
                    me[1] = j;
                } 
            }
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(me);
        int dis = 0;
        while (!q.isEmpty()) {
            ++dis;
            int size = q.size();
            for (int i = 0; i<size; i++) {
                int[] cur = q.poll();
                for (int j = 0; j<4; j++) {
                    int x = cur[0]+dir[j][0];
                    int y = cur[1]+dir[j][1];
                    if (x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] == 'X' || vis[x][y]) 
                        continue;
                    if (grid[x][y] == '#') 
                        return dis;
                    vis[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }
        }
        return -1;
    }
}