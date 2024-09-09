//https://leetcode.com/problems/happy-number/description/

package Easy;

public class HappyNumber {
    public boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }
        int j = 0;
        while ((n != 1) && (j < 30)) {
            String num = String.valueOf(n);
            int localSum = 0;
            for (int i = 0; i < num.length(); i++) {
                Integer i1 = Integer.valueOf(String.valueOf(num.charAt(i)));
                localSum = localSum + (i1 * i1);
            }
            n = localSum;
            j++;
        }
        return n == 1;
    }
}
