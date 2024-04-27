//https://leetcode.com/problems/reverse-bits/description/
//Easy

package Easy;

public class ReverseBits {
    public int reverseBits(String binaryStr) {
        //String sign = binaryStr.substring(0, 1);
        //String binaryReverse = sign + new StringBuilder(binaryStr).deleteCharAt(0).reverse();
        String binaryReverse = new StringBuilder(binaryStr).deleteCharAt(0).reverse().toString();
        String[] binaryArr = binaryReverse.split("");
        int sum = 0;
        byte binary = 2;

        for (int i = binaryArr.length - 1; i >= 0; i--) {
            sum = (int) (sum + Integer.parseInt(binaryArr[i]) * Math.pow(binary, binaryArr.length - (i - 1)));
        }
        return sum;
    }
}
