class Solution {
    
    
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        //construct graph
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        
        //structure the graph
        
        for (int i = 0; i<n; i++) {
            graph.put(i, new ArrayList());
        }
        
        //add values
        
        for (int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        HashSet<Integer> vis = new HashSet<>();
        
        // boolean found = false;
        
        dfs(graph, source, destination, vis);
        
        return found;
        
    }
    
    
    
    public void dfs(HashMap<Integer, List<Integer>> graph, int source, int destination, HashSet<Integer> vis) {
        if (source == destination) {
            System.out.println("Dsf");
            found = true;
            return;
        }
        vis.add(source);
        for (int it: graph.get(source)) {
            if (!vis.contains(it)) {
                dfs(graph, it, destination, vis);
            }
        }
        // return false;
    }
    
    
    
    
}