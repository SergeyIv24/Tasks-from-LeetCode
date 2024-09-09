//https://leetcode.com/problems/valid-palindrome/description/

package Easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.isBlank()) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }
        StringBuilder sbInput = new StringBuilder();
        char[] symbols = s.toCharArray();
        for (char symbol : symbols) {
            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
                sbInput.append(symbol);
            }
        }
        String clearStr = sbInput.toString();
        String reversed = sbInput.reverse().toString();

        return clearStr.equalsIgnoreCase(reversed);
    }

    //Альтернативное решение, переставляя символы в массиве
    public boolean isPalindrome1(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.isBlank()) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }

        StringBuilder sbInput = new StringBuilder();
        char[] symbols = s.toCharArray();
        for (char symbol : symbols) {
            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
                sbInput.append(symbol);
            }
        }
        String input = sbInput.toString().toLowerCase();
        if (input.length() <= 1) {
            return true;
        }

        StringBuilder sbOutput = new StringBuilder();
        char[] onlyLettres = input.toCharArray();
        int j = onlyLettres.length - 1;
        for (int i = 0; i < onlyLettres.length; i++) {
            char swap = onlyLettres[j];
            onlyLettres[j] = onlyLettres[i];
            onlyLettres[i] = swap;
            sbOutput.append(onlyLettres[i]);
            j--;
        }
        return sbInput.toString().equalsIgnoreCase(sbOutput.toString());
    }
}
