class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i<image.length; i++) {
            image[i] = reverse(image[i]);
            for (int j=0; j<image[i].length; j++) {
                if (image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }
    
    public int[] reverse(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) {
            res[i] = arr[arr.length-i-1];
        }
        
        return res;
    }
    
    
}
