//https://leetcode.com/problems/valid-parentheses/
//Easy

package Easy;

public class ValidParentheses {
    public boolean isValid(String s) {
        boolean search1 = false;
        boolean search2 = false;
        boolean search3 = false;
        boolean result = false;
        boolean result1 = false;
        char[] arrchS = s.toCharArray();

        if (arrchS.length % 2 != 0) {
            return result;
        }

        String poli = "";
        for (int i = (s.length()-1); i >= 0; i--){
            poli = poli + s.charAt(i);
        }
        char[] arrPoli = poli.toCharArray();

        if ((arrchS[0] == '(')) {
            if (arrPoli[0] == ')') {
                result1 = true;

            } else {
                result1 = false;

            }
        } if ((arrchS[0] == '[')) {
            if (arrPoli[0] == ']') {
                result1 = true;

            } else {
                result1 = false;

            }

        } if ((arrchS[0] == '{')) {
            if (arrPoli[0] == '}') {
                result1 = true;
            } else {
                result1 = false;
            }
        }

        for (int i = 0; i < arrchS.length; i++){
            if ('(' == arrchS[i]) {
                for (int j = 0; j < arrchS.length; j++){
                    if (')' == arrchS[j]){
                        search1 = true;
                    }
                }
            }
            if ('[' == arrchS[i]) {

                for (int j = 0; j < arrchS.length; j++){
                    if (']' == arrchS[j]){
                        search2 = true;
                    }
                }

            }
            if ('{' == arrchS[i]) {

                for (int j = 0; j < arrchS.length; j++){
                    if ('}' == arrchS[j]){
                        search3 = true;
                    }
                }
            }

        }
        result = search1 | search2 | search3;

        boolean genResult = result & result1;

        return genResult;
    }
}

