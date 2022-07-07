class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        //create a hashmap for username mapping to the timestamp and website
        //user->(timestamp, website)
        Map<String, List<Pair<Integer, String>>> map = new HashMap<>();
        int n = username.length;
        for (int i = 0; i<n; i++) {
            map.putIfAbsent(username[i], new ArrayList<>());
            map.get(username[i]).add(new Pair(timestamp[i], website[i]));
        }
        //a map where we still store the combinations
        //(3 combinations String, number of times it appeared)
        Map<String, Integer> count = new HashMap<>();
        String res = "";
        for (String key: map.keySet()) {
            Set<String> set = new HashSet<>();
            //get the key of pairs
            List<Pair<Integer, String>> list = map.get(key);
            Collections.sort(list, (a,b)->(a.getKey()-b.getKey()));//sort by time
            //Now this is the brute-force way in this we will generate all the combinations
            for (int i = 0; i<list.size(); i++) {
                for (int j = i+1; j<list.size(); j++) {
                    for (int k = j+1; k<list.size(); k++) {
                        String str = list.get(i).getValue() + " " + list.get(j).getValue() + " " + list.get(k).getValue();
                        if (!set.contains(str)) {
                            count.put(str, count.getOrDefault(str, 0)+1);
                            set.add(str);
                        }
                        if (res.equals("") || count.get(res)<count.get(str) || (count.get(res)==count.get(str) && res.compareTo(str)>0)) 
                            res = str;
                    }
                }
            }
        }
        return Arrays.asList(res.split(" "));
    }
}