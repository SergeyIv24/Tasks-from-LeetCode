//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int j : nums1) {
            if (j == binarySearch(nums2, j)) {
                list.add(j);
            }
        }
        int[] outputNums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            outputNums[i] = list.get(i);
        }

        return outputNums;
    }

    public int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                nums[mid] = -1;
                return target;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
