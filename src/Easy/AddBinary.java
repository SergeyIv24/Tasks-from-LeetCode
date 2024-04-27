//https://leetcode.com/problems/add-binary/description/
//Easy
package Easy;

import java.math.BigInteger;

public class AddBinary {
    static BigInteger bigBinary = BigInteger.TWO;
    public String addBinary(String a, String b) {
        BigInteger result = converter(a).add(converter(b));
        return backConverter(result);
    }

    public static BigInteger converter(String exp) {
        String[] expArr = exp.split("");
        BigInteger sum = BigInteger.ZERO;
        for (int i = expArr.length - 1; i >= 0; i--) {
            BigInteger num1 = BigInteger.ZERO.add(bigBinary.pow(expArr.length - (i + 1)));
            BigInteger numBig = BigInteger.ZERO
                    .add(new BigInteger(expArr[i])
                    .multiply(num1));
            sum = sum.add(numBig);
        }
        return sum;
    }

    public static String backConverter(BigInteger bigInteger) {
        StringBuilder sb = new StringBuilder();
        BigInteger surplus;
        while (bigInteger.compareTo(bigBinary) != -1) {
            surplus = bigInteger.mod(bigBinary);
            bigInteger = bigInteger.divide(bigBinary);
            sb.append(surplus);
        }
        return bigInteger + sb.reverse().toString();
    }
}
