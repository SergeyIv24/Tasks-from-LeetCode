//https://leetcode.com/problems/intersection-of-two-arrays/description/

package Easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mapNum1 = new HashMap<>();
        Map<Integer, Integer> mapNum2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            mapNum1.putIfAbsent(nums1[i], i);
        }

        for (int i = 0; i < nums2.length; i++) {
            mapNum2.putIfAbsent(nums2[i], i);
        }

        List<Integer> list = new ArrayList<>();

        for (Integer num : mapNum1.keySet()) {
            if (mapNum2.containsKey(num)) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;



/*        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (Integer n1 : nums1) {
            map.put(n1, 0);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] output = new int[result.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = result.get(i);
        }

        return output;*/
    }

}
