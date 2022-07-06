class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] arrayOfStr = str.toCharArray();
            Arrays.sort(arrayOfStr);
            String sortedStr = String.valueOf(arrayOfStr);
            // System.out.println(sortedStr);
            if (!map.containsKey(sortedStr)) 
                map.put(sortedStr, new ArrayList<String>());
            map.get(sortedStr).add(str);
        }
        // System.out.println(map);
        for (Map.Entry<String, ArrayList<String>> set: map.entrySet()) {
            ans.add(set.getValue());
        }
        return ans;
    }
}