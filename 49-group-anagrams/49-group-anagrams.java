class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hash = new HashMap();
        for (String itr: strs) {
            char[] arr = itr.toCharArray();
            Arrays.sort(arr);
            String sortedVal = String.valueOf(arr);
            if (!hash.containsKey(sortedVal)) {
                hash.put(sortedVal, new ArrayList());
            }
            hash.get(sortedVal).add(itr);
        }
        ans.addAll(hash.values());
        return ans;
    }
}