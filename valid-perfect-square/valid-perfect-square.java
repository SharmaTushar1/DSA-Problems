class Solution {
    public boolean isPerfectSquare(int x) {
        if (x==1) return true;
        int start = 0;
        int end = x;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if ((float)mid==(float)x/(float)mid) return true;
            else if (mid>x/mid) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
}