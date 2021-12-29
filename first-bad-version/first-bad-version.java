/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1 && isBadVersion(1)) return 1;
        int start = 1;
        int end = n;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (!isBadVersion(mid)) start = mid+1;
            else if (isBadVersion(mid)) {
                if (mid>0 && isBadVersion(mid-1)) end = mid-1;
                else return mid;
            }
        }
        return -1;
    }
}