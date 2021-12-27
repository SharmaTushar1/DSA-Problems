class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        if (x<2) return x;
        else {
            while (left<right) {
            int mid = left + (right-left)/2;
            if (mid == x/mid) return mid;
            else if (mid < x/mid) left = mid+1;
            else right = mid;
            }
        }
        
            return left-1;
    }
}