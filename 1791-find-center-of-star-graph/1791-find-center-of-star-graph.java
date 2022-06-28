class Solution {
    public int findCenter(int[][] edges) {
        int[] arr = new int[edges.length+2];
        for (int i = 0; i<edges.length; i++) {
            for (int j=0; j<edges[i].length; j++) {
                arr[edges[i][j]]++;
                if (arr[edges[i][j]]==edges.length) return edges[i][j];
            }
        }
        return -1;
    }
}