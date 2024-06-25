package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThantheCurrentNumber {

    //MoreEffectiveSolution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyNums);

        for (int i = 0; i < copyNums.length; i++) {
            map.putIfAbsent(copyNums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                nums[i] = map.get(nums[i]);
            }
        }
        return nums;
    }

    //O(n^2) solution
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int amountLessNum = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i != j)
                        && (nums[i] > nums[j])
                        && nums[i] != nums[j]) {
                    amountLessNum++;
                }
            }
            counts[i] = amountLessNum;
        }
        return counts;
    }
}
