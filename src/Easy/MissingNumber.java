package Easy;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer number : nums) {
            map.put(number, 0);
        }

        for (int i = 0; i <= length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}
