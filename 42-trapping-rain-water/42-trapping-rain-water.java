class Solution {
    public int trap(int[] height) {
        int area = 0;
        int trappedWater = 0;
        for (int i = 0; i<height.length; i++) {
            int lHeight = 0;
            int rHeight = 0;
            //find lHeight
            for (int j=i-1; j>=0; j--) 
                lHeight = Math.max(lHeight, height[j]);
            //find rHeight
            for (int j = i+1; j<height.length; j++) 
                rHeight = Math.max(rHeight, height[j]);
            int abs = Math.min(lHeight, rHeight);
            area = abs - height[i];
            trappedWater += Math.max(0, area);
        }
        return trappedWater;
    }
}