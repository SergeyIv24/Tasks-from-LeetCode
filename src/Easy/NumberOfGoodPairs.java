package Easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairsAmount = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer counts : map.values()) {
            if (counts > 1) {
                pairsAmount = pairsAmount + counts * (counts - 1) / 2;
            }
        }
        return pairsAmount;
    }
}
