class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i=1; i<=n; i++) 
            map.put(i, new int[]{0,0});
        for (int[] pair: trust) {
            map.get(pair[0])[0]++;
            map.get(pair[1])[1]++;
        }
        for (int i =1; i<=n; i++) {
            if (map.get(i)[0]==0 && map.get(i)[1]==n-1) 
                return i;
        }
        return -1;
    }
}