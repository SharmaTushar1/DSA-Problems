class Solution {
    public int getMaxLen(int[] nums) {
        int pos = 0;
        int neg = 0;
        int ans = 0;
        for (int num: nums) {
            if (num>0) {
                pos++;
                neg = neg==0?0:neg+1;
            } else if (num<0) {
                int temp = pos;
                pos = neg==0?0:neg+1;
                neg = temp+1;
            } else {
                pos = 0;
                neg = 0;
            }
            ans = Math.max(pos, ans);
        }
        return ans;
    }
}