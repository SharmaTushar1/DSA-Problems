class Solution {
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        int n = queries.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());        
        for (int i = 0; i<colors.length; i++) {
            map.get(colors[i]).add(i);
        }
        System.out.println(map);
        for (int[] query: queries) {
            int index = query[0];
            int color = query[1];
            //color is not present
            if (map.get(color).size()==0) {
                System.out.println("dfs");
                ans.add(-1);
                continue;
            }
            //color is present
            List<Integer> cur = map.get(color);
            int start = 0;
            int end = cur.size()-1;
            int minDiff = Integer.MAX_VALUE;
            while (start<=end) {
                int mid = start+(end-start)/2;
                if (cur.get(mid)==index) {
                    minDiff = 0;
                    break;
                } else if (cur.get(mid)<index) {
                    start = mid+1;
                    minDiff = Math.min(Math.abs(index-cur.get(mid)), minDiff);
                } else {
                    end = mid-1;
                    minDiff = Math.min(Math.abs(index-cur.get(mid)), minDiff);
                }
            }
            ans.add(minDiff);
        }
        return ans;
    }
}