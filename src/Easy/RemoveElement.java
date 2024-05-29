package Easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != val) {
                    int swap = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = swap;
                }
            }
        }
        for (Integer number : nums) {
            if (number != val) {
                count++;
            }
        }
        return count;
    }
}
