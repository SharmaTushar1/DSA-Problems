class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j<i+1; j++) {
                if (j==0 || i==0 || j==i) {
                    list.add(1);
                }
                else {
                    int val = triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    list.add(val);
                }
            }
            triangle.add(list);
        }
        return triangle;
    }
}