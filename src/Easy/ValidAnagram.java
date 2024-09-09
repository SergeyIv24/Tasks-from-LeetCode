//https://leetcode.com/problems/valid-anagram/description/

package Easy;

import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        if (s.equals(t)) {
            return true;
        }

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
