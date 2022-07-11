class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) 
            map.put(s.charAt(i), i);
        int end = 0;
        int prev = -1;
        for (int i = 0; i<s.length(); i++) {
            end = Math.max(map.get(s.charAt(i)), end);
            if (i==end) {
                ans.add(end-prev);
                prev = end;
            }
        }
        return ans;
    }
}