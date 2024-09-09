//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150

package Easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.isEmpty() || s.isEmpty()) {
            return false;
        }
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> mapLettersToWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (mapLettersToWord.isEmpty()) {
                mapLettersToWord.put(pattern.charAt(i), words[i]);
                continue;
            }
            if (mapLettersToWord.containsKey(pattern.charAt(i))) {
                String word = mapLettersToWord.get(pattern.charAt(i));
                if (!word.equalsIgnoreCase(words[i])) {
                    return false;
                }
            } else {
                if (mapLettersToWord.containsValue(words[i])) {
                    return false;
                }
                mapLettersToWord.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }

}
