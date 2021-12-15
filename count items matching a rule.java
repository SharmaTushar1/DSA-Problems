//link - https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")) {
            // System.out.print(1);
            for (int i =0; i<items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    System.out.print(items.get(i).get(0));
                    count++;
                } 
            }
        } else if (ruleKey.equals("color")) {
            // System.out.print(11);
            for (int i =0; i<items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    System.out.print(items.get(i).get(1));
                    count++;
                } 
            }
        } else if (ruleKey.equals("name")) {
            // System.out.print(111);
            for (int i =0; i<items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    System.out.print(items.get(i).get(2));
                    count++;
                } 
            }
        }
        return count;
    }
}
