class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        ans.add(intervals[0]);
        for (int i=1; i<intervals.length; i++) {
            int begin = ans.get(ans.size()-1)[0];
            int end = ans.get(ans.size()-1)[1];
            if (intervals[i][0]<=end) {
                ans.get(ans.size()-1)[1] = Math.max(end, intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        int[][] anss = new int[ans.size()][2];
        ans.toArray(anss);
        return anss;
    }
}