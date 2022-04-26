class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length; 
        //Create a min heap to get the minimum cost
        //The heap will take (edgeWeight,next node) in pair as it's each element. Hence we'll need to have 
        //(a, b) -> (a.getKey()-b.getKey()) because even though the priority queue is min heap by default 
        //we'll have to specify what is the factor (here it's the key that is the edgeWeight)
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> (a.getKey()-b.getKey()));
        
     //This is the array that tracks which nodes are visited. This will also help in avoiding cycle detection
        boolean[] inMST = new boolean[n];
        
        //Initially just add the empty value in the heap
        //Initially just add any random value in the heap say (0,0)
        heap.add(new Pair(0, 0));
        int mstCost = 0;
        int edgesUsed = 0;
        
        while (edgesUsed < n) {
            Pair<Integer, Integer> topElement = heap.poll();
            
            int weight = topElement.getKey();
            int currNode = topElement.getValue();
            
            if (inMST[currNode]) continue;
            
            inMST[currNode] = true;
            mstCost += weight;
            edgesUsed++;
            
            for (int nextNode = 0; nextNode < n; nextNode++) {
                if (!inMST[nextNode]) {
                    int nextWeight = Math.abs(points[currNode][0] - points[nextNode][0]) + Math.abs(points[currNode][1] - points[nextNode][1]);
                    heap.add(new Pair(nextWeight, nextNode));
                }
            }
            
        }
        return mstCost;
    }
}