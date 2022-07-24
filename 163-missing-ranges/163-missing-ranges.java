class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> op = new ArrayList<>();
        if (nums.length==0) {
            if (lower == upper)
                op.add(Integer.toString(lower));
            else 
                op.add(Integer.toString(lower)+"->"+Integer.toString(upper));
            return op;
        }
        if (nums[0]>lower) {
            if (lower==nums[0]-1) 
                op.add(Integer.toString(lower));
            else 
                op.add(Integer.toString(lower)+"->"+Integer.toString(nums[0]-1));
        }
        for (int i =1; i<nums.length; i++) {
            if (nums[i-1]==nums[i]-1)
                continue;
            else if (nums[i-1]==nums[i]-2) {
                op.add(Integer.toString(nums[i-1]+1));
            } else {
                op.add(Integer.toString(nums[i-1]+1)+"->"+Integer.toString(nums[i]-1));
            }
        }
        if (nums[nums.length-1]<upper) {
            if (nums[nums.length-1]==upper-1) 
                op.add(Integer.toString(upper));
            else 
                op.add(Integer.toString(nums[nums.length-1]+1)+"->"+Integer.toString(upper));
        }
        return op;
    }
}