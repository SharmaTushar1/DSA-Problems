class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int lMax = 0, rMax = 0;
        int l = 0, r = height.length-1;
        while (l<=r) {
            if (height[l]<=height[r]) {
                if (height[l]>=lMax) lMax = height[l++];
                else trappedWater += lMax-height[l++];
            } else {
                if (height[r]>=rMax) rMax = height[r--];
                else trappedWater += rMax-height[r--];
            }
        }
        return trappedWater;
    }
}