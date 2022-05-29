// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsVis = new boolean[V];
        for (int i = 0; i<V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, dfsVis))
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] dfsVis) {
        vis[i] = true;
        dfsVis[i] = true;
        for (int it: adj.get(i)) {
            if (!vis[it]) {
                if (dfs(it, adj, vis, dfsVis))
                    return true;
            } else if ((dfsVis[it])) {
                return true;
            }
        }
        dfsVis[i] = false;
        return false;
    }
    
}