class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(), a.getValue()));
        for (int i = 0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(map);
        for (Map.Entry<Character, Integer> set: map.entrySet()) {
            pq.add(set);
        }
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> cur1 = pq.poll();
            if (sb.length()==0 || sb.charAt(sb.length()-1)!=cur1.getKey()) {
                sb.append(cur1.getKey());
                cur1.setValue(cur1.getValue()-1);
            } else {
                Map.Entry<Character, Integer> cur2 = pq.poll();
                if (cur2 == null)
                    return "";
                sb.append(cur2.getKey());
                cur2.setValue(cur2.getValue()-1);
                if (cur2.getValue()!=0) pq.add(cur2);
            }
                if (cur1.getValue()!=0) 
                    pq.add(cur1);
            }
        return sb.toString();
    }
}