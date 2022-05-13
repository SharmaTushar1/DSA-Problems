class Solution {
    public int trap(int[] height) {
        int area = 0;
        int trappedWater = 0;
        
        int lMax = 0, rMax = 0;
        
        int l = 0, r = height.length-1;
        
        while (l<=r) {
            if (height[l]<=height[r]) {
                //that means water can be filled if there's a tower in left which is greater so check for that
                if (height[l]>=lMax) lMax = height[l];
                else trappedWater += lMax-height[l];
                l++;
            } else {
                if (height[r]>=rMax) rMax = height[r];
                else trappedWater += rMax-height[r];
                r--;
            }
        }
        
        return trappedWater;
    }
}