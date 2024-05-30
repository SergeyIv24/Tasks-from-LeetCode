package Easy;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int k = (nums.length / 2) + 1;
        Arrays.sort(nums);
        int count = 1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                count++;
            } else {
                count = 1;
                j = i + 1;
            }
            if (count >= k) {
                return nums[i];
            }
        }
        return 0;
    }
}
