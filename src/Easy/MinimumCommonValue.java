package Easy;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        for (int j : nums1) {
            int low = 0;
            int high = nums2.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (nums2[mid] == j) {
                    return nums2[mid];
                } else if (nums2[mid] > j) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
