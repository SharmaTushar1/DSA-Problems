class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i<ops.length; i++) {
            if (ops[i].equals("C")) {
                list.remove(j-1);
                j--;
            } else if (ops[i].equals("D")) {
                list.add(2*list.get(j-1));
                j++;
            } else if (ops[i].equals("+")) {
                list.add(list.get(j-1)+list.get(j-2));
                j++;
            } else {
                list.add(Integer.parseInt(ops[i]));
                j++;
            }
        }
        int ans = 0;
        for (int i = 0; i<list.size(); i++) {
            ans += list.get(i);
        }
        
        return ans;
    }
}