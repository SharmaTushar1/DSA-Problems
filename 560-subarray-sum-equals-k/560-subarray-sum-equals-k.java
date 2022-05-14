class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //prefixSum, count
        for (int i = 0; i<nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0)+1);
            sum+=nums[i];
            if (map.containsKey(sum-k)) ans+=map.get(sum-k);
        }
        return ans;
    }
}