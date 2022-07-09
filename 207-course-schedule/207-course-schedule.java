class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //make the adjacency list graph
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for (int arr[]: prerequisites) {
            int prev = arr[1];
            int cur = arr[0];
            var list = adj.getOrDefault(prev, new ArrayList<>());
            list.add(cur);
            inDegree[cur]++;
            adj.put(prev, list);
        }
        Queue<Integer> q = new LinkedList<>();
        //Add the nodes with inDegree == 0
        for (int i=0; i<inDegree.length; i++) 
            if (inDegree[i] == 0) 
                q.add(i);
        //Kahn's algorithm
        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            if (adj.containsKey(node)) {
                for (int it: adj.get(node)) {
                    inDegree[it]--;
                    if (inDegree[it]==0) 
                        q.add(it);
                }
            }
        }
        return numCourses == count;
    }
}