//https://leetcode.com/problems/binary-search/description/
//Easy

package Easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int lowIdx = 0;
        int highIdx = nums.length - 1;

        while (lowIdx <= highIdx) {
            int middleIdx = (lowIdx + highIdx) / 2;

            if (nums[middleIdx] == target) {
                return middleIdx;
            } else if (nums[middleIdx] < target) {
                lowIdx = middleIdx + 1;
            } else {
                highIdx = middleIdx - 1;
            }
        }
        return -1;
    }
}
