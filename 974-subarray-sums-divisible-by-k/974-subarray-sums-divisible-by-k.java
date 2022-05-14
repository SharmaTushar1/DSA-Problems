class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        int sum = 0;
        for (int i = 0; i<nums.length; i++) {
            //we've to count a zero also (for the case where complete nums is divisible) that's why put first
            map.put(sum%k>=0?sum%k:sum%k+k, map.getOrDefault(sum%k>=0?sum%k:sum%k+k, 0)+1);
            sum += nums[i];
            if (map.containsKey(sum%k>=0?sum%k:sum%k+k)) {
                ans+=map.get(sum%k>=0?sum%k:sum%k+k);
            }
        }
        return ans;
    }
}