//https://leetcode.com/problems/power-of-two/description/

package Easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        } else {
            if (n % 2 != 0) {
                return false;
            }
            return isPowerOfTwo(n / 2);
        }
    }
}
