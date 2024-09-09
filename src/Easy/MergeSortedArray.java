//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

package Easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Idx = (m + n) - 1;
        int nums2Idx = n - 1;

        while (nums2Idx >= 0) {
            nums1[nums1Idx] = nums2[nums2Idx];
            nums2Idx--;
            nums1Idx--;
        }
        int left = 0;
        int right = nums1.length - 1;

        while (left <= right) {
            for (int i = left; i < right; ++i) {
                if (nums1[i] > nums1[i + 1]) {
                    int swap = nums1[i + 1];
                    nums1[i + 1] = nums1[i];
                    nums1[i] = swap;
                }
            }
            --right;

            for (int j = right; j > left; --j) {
                if (nums1[j] < nums1[j - 1]) {
                    int swap = nums1[j - 1];
                    nums1[j - 1] = nums1[j];
                    nums1[j] = swap;
                }
            }
            ++left;
        }
    }
}