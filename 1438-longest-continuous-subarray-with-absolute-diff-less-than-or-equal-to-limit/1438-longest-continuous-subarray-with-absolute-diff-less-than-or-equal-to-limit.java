class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        int start = 0, end = 0;
        while (end<nums.length) {
            int num = nums[end];
            //make minDq increasing
            while (!minDq.isEmpty() && nums[minDq.peekLast()]>=num)
                minDq.pollLast();
            minDq.addLast(end);
            //make the maxDq decreasing
            while (!maxDq.isEmpty() && nums[maxDq.peekLast()]<=num)
                maxDq.pollLast();
            maxDq.addLast(end);
            int max = nums[maxDq.peekFirst()];
            int min = nums[minDq.peekFirst()];
            if (max-min>limit) {
                start++;
                if (start>minDq.peekFirst())
                    minDq.pollFirst();
                if (start>maxDq.peekFirst())
                    maxDq.pollFirst();
            } else {
                ans = Math.max(end-start+1, ans);
                end++;
            }
        }
        return ans;
    }
}