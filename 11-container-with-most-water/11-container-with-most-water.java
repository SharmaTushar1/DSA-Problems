class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, start = 0, end=height.length-1;
        while (start<end) {
            maxArea = Math.max(Math.min(height[start], height[end])*(end-start), maxArea);
            if (height[start]<height[end]) start++;
            else end--;
        }
        return maxArea;
    }
}