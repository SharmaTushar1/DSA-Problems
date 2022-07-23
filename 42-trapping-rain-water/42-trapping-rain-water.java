class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = 0;
        int i=0, j=height.length-1;
        int ans = 0;
        while (i<=j) {
            left = Math.max(height[i], left);
            right = Math.max(height[j], right);
            if (height[i]<height[j]) {
                ans+=Math.min(left, right)-height[i++];
            } else {
                ans+=Math.min(left, right)-height[j--];
            }
        }
        return ans;
    }
}