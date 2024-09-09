//https://leetcode.com/problems/sort-array-by-parity/description/

package Easy;

public class SortArrayByParity {

    //Сортировка выбором O(n^2)
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                int evenNumber = nums[i];
                int evenNumberIdx = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        evenNumber = nums[j];
                        evenNumberIdx = j;
                    }
                }
                nums[evenNumberIdx] = nums[i];
                nums[i] = evenNumber;
            }
        }
        return nums;
    }
}
