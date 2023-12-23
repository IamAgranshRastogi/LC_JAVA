class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int frst = m - 1;
        int sec = n - 1;
        int mrgd = m + n - 1;
        
        while (sec >= 0) {
            if (frst >= 0 && nums1[frst] > nums2[sec]) {
                nums1[mrgd--] = nums1[frst--];
            } else {
                nums1[mrgd--] = nums2[sec--];
            }
        }
    }
}
// TC:O(m+n)
//SC:O(1)