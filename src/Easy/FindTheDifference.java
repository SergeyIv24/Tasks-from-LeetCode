package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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



/*        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }*/



/*        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(i, s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsValue(t.charAt(i))) {
                return t.charAt(i);
            }
        }
        return ' ';*/
    }
}
