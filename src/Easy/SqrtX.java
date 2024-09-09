//https://leetcode.com/problems/sqrtx/

package Easy;

public class SqrtX {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
       if (x == 1) {
            return 1;
        }

        int lowIdx = 1;
        int highIdx = x - 1;

        int middleIdx;
        while (lowIdx <= highIdx) {
            middleIdx = (lowIdx + highIdx) / 2;

            if ((long) middleIdx * middleIdx == (long) x) {
                return middleIdx;
            } else if ((long) middleIdx * middleIdx > (long) x) {
                highIdx = middleIdx - 1;
            } else {
                lowIdx = middleIdx + 1;
            }
        }
        return highIdx;
    }
}
