class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int count = 0;
        HashSet<Integer> vis = new HashSet<>();
        for (int i = 0; i<rooms.size(); i++) {
            if (!vis.contains(i)) {
                dfs(i, rooms, vis);
                count++;
            }
        }
        return count==1;
    }
    
    public void dfs(int i, List<List<Integer>> rooms, HashSet<Integer> vis) {
        vis.add(i);
        for (Integer it: rooms.get(i)) {
            if (!vis.contains(it)) {
                dfs(it, rooms, vis);
            }
        }
    }
    
}