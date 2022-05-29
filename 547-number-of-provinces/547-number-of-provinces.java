class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int V = isConnected.length;
        boolean[] vis = new boolean[V];
        for (int i=0; i<V; i++) {
            if (!vis[i]) {
                dfs(i, isConnected, vis);
                count++;
            }
        }
        return count;
    }
    
    public void dfs(int i, int[][] isConnected, boolean[] vis) {
        vis[i] = true;
        for (int j = 0; j<isConnected.length; j++) {
            if (isConnected[i][j] == 1 && i!=j && !vis[j]) 
                dfs(j, isConnected, vis);
        }
    }
    
}