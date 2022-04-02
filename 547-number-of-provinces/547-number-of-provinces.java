class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i=0; i<n; i++) {
            if (!vis[i]) {
                dfs(isConnected, i, vis);
                count++;
            }
        }
        return count;
    }
    
    public void dfs(int[][] isConnected, int s, boolean[] vis) {
        vis[s] = true;
        for (int i = 0; i<isConnected.length; i++) {
            if (isConnected[s][i] !=0 && !vis[i]) {
                dfs(isConnected, i, vis);
            }
        }
    }
    
}