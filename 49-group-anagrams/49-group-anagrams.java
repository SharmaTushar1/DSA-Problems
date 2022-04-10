class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> h = new HashMap<>();
        for (String str: strs) {
            char[] sortedArr = str.toCharArray();
            Arrays.sort(sortedArr);
            String sorted = String.valueOf(sortedArr);
            if (!h.containsKey(sorted)) {
                h.put(sorted, new ArrayList());
            }
            h.get(sorted).add(str);
        }
        ans.addAll(h.values());
        return ans; 
    }
}