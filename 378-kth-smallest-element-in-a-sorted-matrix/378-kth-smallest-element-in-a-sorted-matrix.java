class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int [] mat: matrix) {
            for (int i: mat) {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}