//https://leetcode.com/problems/reverse-bits/description/

package Easy;

public class ReverseBits {

    public int reverseBits(int n) {
        String binaryInput = Integer.toBinaryString(n);
        String[] binArr = binaryInput.split("");
        String[] bitsForInt = new String[32];
        int j = binArr.length - 1;
        for (int i = bitsForInt.length - 1; j >= 0; i--, j--) {
            bitsForInt[i] = binArr[j];
        }
        for (int i = 0; i < bitsForInt.length; i++) {
            if (bitsForInt[i] == null) {
                bitsForInt[i] = "0";
            }
        }

        String fullInputNum = String.join("", bitsForInt);
        String reversed = new StringBuilder(fullInputNum).reverse().toString();
        return (int) Long.parseLong(reversed, 2);
    }
}
