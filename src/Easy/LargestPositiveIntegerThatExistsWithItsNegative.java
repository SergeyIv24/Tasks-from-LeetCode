package Easy;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int k = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                int negativeNum = nums[i] * (-1);
                for (int j = 0; j < nums.length; j++) {
                    if (negativeNum == nums[j]) {
                        if (nums[i] > k) {
                            k = nums[i];
                            break;
                        }
                    }
                }
            }
        }
        return k;
    }
}
