class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        for (int end = 0; end<fruits.length; end++) {
            map.put(fruits[end], end);
            if (map.size()>2) {
                int minIndex = Collections.min(map.values());
                map.remove(fruits[minIndex]);
                start = minIndex+1;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}