//https://leetcode.com/problems/contains-duplicate/description/

package Easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer n : nums) {
            if (map.containsKey(n)) {
                return true;
            }
            map.put(n, 0);
        }
        return false;
    }
}
