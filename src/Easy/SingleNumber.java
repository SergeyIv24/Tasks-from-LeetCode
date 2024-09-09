//https://leetcode.com/problems/single-number/description/

package Easy;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        while (true) {
            Arrays.sort(nums);
            if (nums[nums.length - 1] != nums[nums.length - 2]) {
                return nums[nums.length - 1];
            }
            if (nums[0] != nums[1]) {
                return nums[0];
            }
            nums = Arrays.copyOfRange(nums, 2, nums.length - 2);
        }
    }
}
