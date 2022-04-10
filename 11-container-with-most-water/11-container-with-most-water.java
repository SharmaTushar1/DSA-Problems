class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;
        while (start<end) {
            maxArea = Math.max((end-start)*Math.min(height[start],height[end]), maxArea);
            if (height[start]<height[end]) start++;
            else end--;
        }
        return maxArea;
    }
}