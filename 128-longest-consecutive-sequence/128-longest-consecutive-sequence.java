class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int maxCount = 1;
        for (int num: nums) set.add(num);
        for (int num: nums) {
            //check whether the number is start of the sequence
            if (!set.contains(num-1)) {
                int count = 1;
                while (set.contains(num+1)) {
                    count++;
                    num++;
                    maxCount = Math.max(count, maxCount);
                }
            }
        }
        return  maxCount;
    }
}