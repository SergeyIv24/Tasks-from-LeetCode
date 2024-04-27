//https://leetcode.com/problems/plus-one/description/
//Easy

package Easy;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String arrStr = Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return Arrays.stream(String.valueOf(new BigInteger(arrStr).add(BigInteger.ONE)).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
