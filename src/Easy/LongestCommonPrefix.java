//https://leetcode.com/problems/longest-common-prefix/description/

package Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int idxShortestWord = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[idxShortestWord].length() > strs[i].length()) {
                idxShortestWord = i;
            }
        }
        int lenOfShortestWord = strs[idxShortestWord].length();

        StringBuilder prefix = new StringBuilder();

        for (int j = 0; j < lenOfShortestWord; j++) {
            char letter = ' ';
            int i;
            for (i = 1; i < strs.length; i++) {
                if (strs[i].isEmpty() || strs[i - 1].isEmpty()) {
                    return "";
                }
                if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                    return prefix.toString();
                }
                letter = strs[i].charAt(j);
            }
            prefix.append(letter);
        }
        return prefix.toString();










/*        int idxShortestWord = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i - 1].length() > strs[i].length()) {
                idxShortestWord = i;
            }
        }
        int lenOfShortestWord = strs[idxShortestWord].length();

        StringBuilder prefix = new StringBuilder();

        for (int j = 0; j < lenOfShortestWord; j++) {
            char letter = ' ';
            int i = 0;
            for (i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                    return prefix.toString();
                }
                letter = strs[i].charAt(j);
            }
            prefix.append(letter);
        }
        return prefix.toString();*/







/*        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //Индекс самого короткого слова в массиве
        int idxShortestWord = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i - 1].length() > strs[i].length()) {
                idxShortestWord = i;
            }
        }
        System.out.println(idxShortestWord);

        StringBuilder prefix = new StringBuilder();
        int j = 0;
        int lenShortestWord = strs[idxShortestWord].length();
        for (int i = 1; j < lenShortestWord; i++) {
            if (strs[i].isEmpty() || strs[i - 1].isEmpty()) {
                return "";
            }
            if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                return "";
            }
            prefix.append(strs[i].charAt(j));
            if (i == (strs.length - 1)) {
                i = 0;
                j++;
            }
        }
        return prefix.toString();*/
    }
}
