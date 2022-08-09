class Solution {
    public long countBadPairs(int[] nums) {
        long MOD = Long.MAX_VALUE;
        long goodPairs = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (map.containsKey(i-nums[i])) goodPairs+=map.get(i-nums[i]);
            map.put(i-nums[i], map.getOrDefault(i-nums[i], 0)+1);
        }
        long total = (n%MOD*(n-1)%MOD)/2;
        return total-goodPairs;
    }
}