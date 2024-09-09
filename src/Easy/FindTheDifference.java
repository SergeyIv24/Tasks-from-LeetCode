//https://leetcode.com/problems/find-the-difference/description/

package Easy;

import java.util.Arrays;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for (int i = 0; i < arrT.length; i++) {
            if ((i >= s.length())
                    || (arrT[i] != arrS[i])) {
                return arrT[i];
            }
        }
        return ' ';
    }
}
