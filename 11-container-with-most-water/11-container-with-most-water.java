class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        
        int i = 0; 
        int j = height.length-1;
        
        while (i<j) {
            
            int side = Math.min(height[i],height[j]);
            area = Math.max(area, (j-i)*side);
            
            if (height[i]<height[j]) {
                i++;
            } else j--;
            
            
        }
        
        return area;
    }
}

/*
class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        for (int i = 0; i<height.length-1; i++) {
            // area = 0;
            for (int j = i+1; j<height.length; j++) {
                
                int side = Math.min(height[i], height[j]);
                
                area = Math.max(area, side*(j-i));
                
            }
        }
        return area;
    }
}
*/