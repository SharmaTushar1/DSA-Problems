class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]==0) sum--;
            else sum++;
            if (!map.containsKey(sum)) map.put(sum, i);
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i-map.get(sum));
            }
        }
        return ans;
    }
}