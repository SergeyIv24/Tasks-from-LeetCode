//https://leetcode.com/problems/two-sum/description/

package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum1(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (map.containsKey(secondNumber) && i != map.get(secondNumber)) {
                return new int[]{i, map.get(secondNumber)};
            }
        }
        return new int[2];
    }



    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; i < nums.length; j++){
                if (i!=j){
                    int sum = nums[i] + nums [j];
                    if (sum == target) {
                        twoSum[0] = i;
                        twoSum[1] = j;
                        if (sum == target){
                            break;
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return twoSum;
    }
}
