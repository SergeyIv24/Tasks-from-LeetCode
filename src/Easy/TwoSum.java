//https://leetcode.com/problems/two-sum/description/
//Easy
package Easy;

import java.util.Arrays;
public class TwoSum {
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
