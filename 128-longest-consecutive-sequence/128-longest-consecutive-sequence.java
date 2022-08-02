class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums)
            set.add(num);
        int ans = 0;
        for (int num: nums) {
            int count = 0;
            int temp = num;
            if (set.contains(temp-1)) {
                continue;
            }
            else {
                while (set.contains(temp)) {
                    count++;
                    temp++;
                }
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}