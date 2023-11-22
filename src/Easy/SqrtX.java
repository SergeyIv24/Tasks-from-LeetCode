//https://leetcode.com/problems/sqrtx/
//Easy

package Easy;

public class SqrtX {
    public int mySqrt(int x) {
        int x2=1;
        if (x > 0){
            double x1 = Math.sqrt(x);
            x2 = (int) x1;
        } else {
            return 0;
        }
        return x2;
    }
}
