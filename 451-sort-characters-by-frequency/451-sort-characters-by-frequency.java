class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        for (Map.Entry set: map.entrySet()) {
            pq.add(set);
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> set = pq.poll();
            for (int i = 0; i<set.getValue(); i++) {
                sb.append(set.getKey());
            }
        }
        return sb.toString();
    }
}