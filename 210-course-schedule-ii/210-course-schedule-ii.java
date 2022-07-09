class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //build a graph
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for (int[] i: prerequisites) {
            int prev = i[1];
            int cur =i[0];
            var list = adj.getOrDefault(prev, new ArrayList<>());
            list.add(cur);
            inDegree[cur]++;
            adj.put(prev, list);
        }
        //Kahns algorithm
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<numCourses; i++) 
            if (inDegree[i]==0) 
                q.add(i);
        int index = 0;
        int[] topo = new int[numCourses];
        while (!q.isEmpty()) {
            int node = q.poll();
            topo[index++] = node;
            if (adj.containsKey(node)) {
                for (int it: adj.get(node)) {
                    inDegree[it]--;
                    if (inDegree[it]==0) 
                        q.add(it);
                }
            }
        }
        
        
        
        return numCourses==index?topo: new int[]{};
    }
}