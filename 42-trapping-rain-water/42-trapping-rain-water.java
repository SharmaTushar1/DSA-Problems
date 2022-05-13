class Solution {
    public int trap(int[] height) {
        int area = 0;
        int trappedWater = 0;
        
        //create a leftPrefix array
        int[] left = new int[height.length];
        int l = 0;
        for (int i =  0; i<height.length; i++) {
            l = Math.max(l, height[i]);
            left[i] = l;
        }
        //create a rightPrefix array
        int[] right = new int[height.length];
        int r = 0;
        for (int i = height.length-1; i>=0; i--) {
            r = Math.max(r, height[i]);
            right[i] = r;
        }
        
        for (int i = 0; i<height.length; i++) {
            area = Math.min(left[i], right[i]) - height[i];
            trappedWater += Math.max(0, area);
        }
        return trappedWater;
    }
}