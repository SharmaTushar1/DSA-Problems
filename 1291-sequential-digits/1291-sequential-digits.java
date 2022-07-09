class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int num = 0;
        int start = 0; 
        int end = 0;
        int temp = low;
        List<Integer> ans = new ArrayList<>();
        while (temp>0) {
            end++;
            temp/=10;
        }
        int count = 0;
        int prev = end;
        while (num<high) {
            num = 0;
            if (end>nums.length) {
                start = 0;
                count++;
                end = prev+count;
            }
            if (end>nums.length)
                break;
            for (int i = start; i<end; i++) {
                num = num*10+nums[i];
            }
            if (num>=low && num<=high)
                ans.add(num);
            start++;
            end++;
        }
        return ans;
    }
}