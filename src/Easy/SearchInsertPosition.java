package Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lowIdx = 0;
        int highIdx = nums.length - 1;
        int middleIdx = 0;
        while (lowIdx <= highIdx) {
            middleIdx = (lowIdx + highIdx) / 2;

            if (nums[middleIdx] == target) {
                return middleIdx;
            } else if (nums[middleIdx] < target) {
                lowIdx = middleIdx + 1;
            } else {
                highIdx = middleIdx - 1;
            }
        }
        if (nums[middleIdx] > target) {
            return middleIdx;
        }
        return middleIdx + 1;
    }
}
