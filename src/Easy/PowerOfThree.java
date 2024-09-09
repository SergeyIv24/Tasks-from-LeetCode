//https://leetcode.com/problems/power-of-three/description/

package Easy;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        } else {
            if (n % 3 != 0) {
                return false;
            }
            return isPowerOfThree(n / 3);
        }
    }
}
