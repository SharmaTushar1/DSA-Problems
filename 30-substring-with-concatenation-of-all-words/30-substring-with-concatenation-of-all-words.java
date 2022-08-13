class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> op = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> tempMap = new HashMap<>();
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
            tempMap.put(word, tempMap.getOrDefault(word, 0)+1);
        }
        int len = words[0].length();
        int start = 0, end = 0;
        while (end<s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<len; i++) {
                if (end>=s.length()) break;
                sb.append(s.charAt(end++));
            }
            String cur = sb.toString();
            if (tempMap.containsKey(cur)) {
                if (tempMap.get(cur)==1) {
                    tempMap.remove(cur);
                }
                else tempMap.put(cur, tempMap.get(cur)-1);
            } else {
                tempMap.clear();
                tempMap.putAll(map);
                start++;
                end = start;
            }
            if (tempMap.size()==0) {
                op.add(start++);
                end = start;
                tempMap.clear();
                tempMap.putAll(map);
            }
        }
        return op;
    }
}