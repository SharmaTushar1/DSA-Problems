// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] vis = new boolean[V];
        int ans = 0;
        for (int i = 0; i<V; i++) {
            if (!vis[i]) {
                dfs(adj, i, vis);
                ans++;
            }
        }
        return ans;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vis) {
        vis[i] = true;
        for (int j = 0; j<adj.get(i).size(); j++) {
            if (i!=j && adj.get(i).get(j)!=0 && !vis[j]) {
                dfs(adj, j, vis);
            }
        }
    }
    
};