//https://leetcode.com/problems/valid-parentheses/

package Easy;

import java.util.ArrayDeque;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }
        if (s.isBlank() || s.length() < 2) {
            return false;
        }

        char[] openedBrackets = new char[]{'(', '{', '['};
        char[] closedBrackets = new char[]{')', '}', ']'};
        if (s.charAt(0) == closedBrackets[0]
                || s.charAt(0) == closedBrackets[1]
                || s.charAt(0) == closedBrackets[2]) {
            return false;
        }
        char[] inputArray = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char bracket : inputArray) {
            if (bracket == openedBrackets[0]
                    || bracket == openedBrackets[1]
                    || bracket == openedBrackets[2]) {
                stack.push(bracket);
            }

            if (bracket == closedBrackets[0]
                    || bracket == closedBrackets[1]
                    || bracket == closedBrackets[2]) {
                if (stack.isEmpty()) {
                    return false;
                }

                char stackBracket = stack.pop();

                if (bracket == closedBrackets[0] && stackBracket != openedBrackets[0]) {
                    return false;
                }
                if (bracket == closedBrackets[1] && stackBracket != openedBrackets[1]) {
                    return false;
                }
                if (bracket == closedBrackets[2] && stackBracket != openedBrackets[2]) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
