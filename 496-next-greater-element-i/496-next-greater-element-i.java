class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i<nums1.length; i++) {
            int cur = nums1[i];
            boolean flag = false;
            boolean updated = false;
            for (int j = 0; j<nums2.length; j++) {
                if (cur == nums2[j] && !flag) flag = true;
                if (flag && nums2[j]>cur) {
                    nums1[i] = nums2[j];
                    updated = true;
                    break;
                }
            }
            if (!updated) nums1[i] = -1;
        }
        return nums1;
    }
}