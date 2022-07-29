class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for (int[] prerequisite: prerequisites) {
            if (!adj.containsKey(prerequisite[1])) 
                adj.put(prerequisite[1], new ArrayList<>());
            adj.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        //add the numbers with indegree 0 in the queue
        for (int i=0; i<inDegree.length; i++) {
            if (inDegree[i]==0) {
                q.add(i);
                count++;
            }
        }
        while (!q.isEmpty()) {
            int level = q.size();
            for (int i=0; i<level; i++) {
                int cur = q.poll();
                if (adj.containsKey(cur)) {
                    for (int it: adj.get(cur)) {
                        inDegree[it]--;
                        if (inDegree[it]==0) {
                            q.add(it);
                            count++;
                        }
                    }
                }
            }
        }
        return numCourses==count;
    }
}