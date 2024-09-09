//https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150

package Easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    //Сложность O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null) {
            return false;
        }

        if (nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.isEmpty()) {
                map.put(nums[i], i);
                continue;
            }

            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
