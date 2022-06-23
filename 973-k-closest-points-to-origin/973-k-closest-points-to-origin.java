class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<int[], Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for (int i = 0; i<points.length; i++) {
            map.put(points[i], (int)(Math.pow(points[i][0], 2)+Math.pow(points[i][1], 2)));
        }
        for (Map.Entry set: map.entrySet()) {
            pq.add(set);
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i<k; i++) {
            int[] temp = pq.poll().getKey();
            ans[i][0] = temp[0];
            ans[i][1] = temp[1];
        }
        return ans;
    }
}