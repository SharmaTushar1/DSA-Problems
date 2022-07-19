class Solution {
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        int m = rooms.length; 
        int n = rooms[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (rooms[i][j]==0) 
                    q.add(new int[]{i, j});
            }
        }
        if (q.size()==0)
            return;
        int[][] dirs = {{-1,0}, {0,-1}, {1,0}, {0,1}};
        int dis = 0;
        while (!q.isEmpty()) {
            ++dis;
            int[] cur = q.poll();
            System.out.println(Arrays.toString(cur));
            for (int[] dir: dirs) {
                int x = cur[0]+dir[0];
                int y = cur[1]+dir[1];
                if (x>=m || y>=n || x<0 || y<0 || rooms[x][y]!=Integer.MAX_VALUE)
                    continue;
                q.add(new int[]{x, y});
                rooms[x][y] = rooms[cur[0]][cur[1]]+1;
            }
        }
    }
}