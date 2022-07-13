class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] vis = new boolean[n];
        int count = 0;
        List<Integer>[] adj = new ArrayList[n];
        for (int i =0; i<n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int[] edge: edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        for (int i = 0; i<n; i++) {
            if (!vis[i]) {
                dfs(i, vis, adj);
                count++;
            }
        }
        return count;
    }
    
    public void dfs(int i, boolean[] vis, List<Integer>[] adj) {
        vis[i] = true;
        for (int it = 0; it<adj[i].size(); it++) {
            if (!vis[adj[i].get(it)])
                dfs(adj[i].get(it), vis, adj);
        }
    }
    
}