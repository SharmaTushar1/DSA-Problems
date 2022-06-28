class Solution {
    
    
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i<n; i++) {
            graph.put(i, new ArrayList());
        }        
        for (int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        HashSet<Integer> vis = new HashSet<>();
        return dfs(graph, source, destination, vis, false);
        
    }
    
    public boolean dfs(HashMap<Integer, List<Integer>> graph, int source, int destination, HashSet<Integer> vis, boolean ans) {
        if (source == destination) {
            ans = true;
        }
        else {
            vis.add(source);
            for (int it: graph.get(source)) {
                if (!vis.contains(it)) {
                    ans = dfs(graph, it, destination, vis, ans);
                }
            }
        }
        return ans;
    } 
}